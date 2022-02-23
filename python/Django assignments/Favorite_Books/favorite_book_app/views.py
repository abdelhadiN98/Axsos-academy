from ast import Return
from django.shortcuts import render,redirect , HttpResponse
from login_updated_app.models import User , Book
# import bcrypt
# from django.contrib import messages

def welcome_page(request):
    this_user = User.objects.get(id=request.session['user_id'])
    # print(this_user.id)
    context={
        'this_user' : this_user,
        'all_books' : Book.objects.all()
    }
    return render(request , 'welcome.html' , context)

def add_books(request):
    Book.objects.create(
        title = request.POST['title'],
        desc = request.POST['description'],
        uploaded_by = User.objects.get(id=request.session['user_id'])
    )
    return redirect('/books')

# def delete(request):
#     del(request.session['user_id'])
#     # del(request.session['first_name'])
#     return redirect('/')

# method to render the details page for the book we choose
def book_details(request,book_id):
    this_book = Book.objects.get(id = book_id)
    print(this_book.id)
    this_user = User.objects.get(id=request.session['user_id'])
    user_name = this_user.first_name
    cont={
        'this_book' : this_book,
        'this_user' : this_user,
        'user_name' : user_name
        # 'all_books' : Book.objects.all()
    }
    return render(request , 'Book_details.html' , cont)

# add books to favorite :
def add(request , id_book):
    this_user = User.objects.get(id=request.session['user_id'])
    this_book = Book.objects.get(id = id_book)
    this_book.users_who_like.add(this_user)
    return redirect('/books')

# remove from favorite 
def unfavorite(request , book_id):
    this_user = User.objects.get(id=request.session['user_id'])
    this_book = Book.objects.get(id = book_id)
    this_book.users_who_like.remove(this_user)
    return redirect(f'/book_details/{book_id}')

# update the description :
def update(request , book_id):
    # this_user = User.objects.get(id=request.session['user_id'])
    this_book = Book.objects.get(id = book_id)
    this_book.desc = request.POST['update_desc']
    this_book.save()
    return redirect (f'/book_details/{book_id}')

# delete the book :
def remove(request , book_id):
    this_book = Book.objects.get(id = book_id)
    this_book.delete()
    return redirect ('/books')

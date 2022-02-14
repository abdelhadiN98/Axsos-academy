from django.shortcuts import render,redirect

from .models import Book , Author

# show the add a book page with results of adding
def show(request):
    context={
        'infoBook' : Book.objects.all()
    }
    return render(request , 'show.html' , context)

# add a book and redirect the results to show page
def main(request):
    Book.objects.create(title = request.POST['title'] , desc = request.POST['describtion'])
    return redirect('/')

# show the add an author page with results of adding
def form(request):
    conte={
        'infoAuthor' : Author.objects.all()
    }
    return render (request , 'authors.html', conte)

# add an author and redirect the results to show page
def add(request):
    Author.objects.create(first_name = request.POST['firstName'] , last_name = request.POST['lastName'] , notes = request.POST['notes'])
    return redirect('/author')

def result(request , number):
    infoBook = Book.objects.get(id =number)
    author = infoBook.authors.all()
    con={
        'infoBook' : infoBook,
        'author' : author
    }
    return render(request , 'describtion.html', con)

def details(request , num):
    infoAuthor = Author.objects.get(id = num)
    Context={
        'infoAuthor' : infoAuthor
    }
    return render(request , 'info_author.html' , Context)

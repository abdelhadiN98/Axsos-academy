from django.shortcuts import render,redirect,HttpResponse

from .models import TV

# Create your views here.

# show the main page 
def show(request):
    return render(request , 'add_show.html')

# show the read page 
def read(request , number):
    channel = TV.objects.get(id=number)
    context={
        'channel':channel
    }
    
    return render(request , 'read.html' , context)

#create a tv shows and redirect the results to (read def)
def display(request ):
    TV.objects.create(title = request.POST['title'] , network = request.POST['network'] , 
    release_date = request.POST['date'] , description = request.POST['description'])
    return redirect('shows/new')

# database table shown
def data(request):
    con={
        'database' : TV.objects.all()
    }
    return render(request , 'database.html' , con)

# show update page :
def update (request , num):
    tv_show = TV.objects.get(id=num)
    cont={
        'tv_show':tv_show
    }
    return render(request , 'update.html' , cont)

# editing database 
def edit(request , n):
    a = TV.objects.get(id = n)
    a.title = request.POST['title_update']
    a.network = request.POST['network_update']
    a.release_date = request.POST['date_update']
    a.description = request.POST['description_update']
    a.save()
    return redirect(f'/shows/{n}')

#delete from database
def delete(request , n):
    show = TV.objects.get(id = n)
    show.delete()
    return redirect('/shows')


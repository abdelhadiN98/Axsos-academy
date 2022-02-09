from multiprocessing import context
from django.shortcuts import render,redirect
from .models import users

def show(request):
    context={
        'info':users.objects.all(),
    }
    return render(request , 'users_temp.html',context)

def result(request):
    users.objects.create(first_name=request.POST['firstname'],last_name=request.POST['lastname'],Email=request.POST['email'],age=request.POST['age'])
    return redirect('/')




from django.shortcuts import render,redirect

from .models import Dojo,ninja

def show(request):
    context={
        'info':Dojo.objects.all(),
    }
    return render(request,'ninjaASS.html',context)

def result(request):
    Dojo.objects.create(name = request.POST['first_name'],city = request.POST['city'],state=request.POST['state'])
    return redirect('/')

def Ninja(request):
    ninja.objects.create(first_name = request.POST['first_name1'],last_name = request.POST['Last Name'],
    dojo = Dojo.objects.get( id = request.POST['value']))
    return redirect('/')






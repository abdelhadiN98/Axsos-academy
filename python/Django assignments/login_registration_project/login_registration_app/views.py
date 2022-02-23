
# from multiprocessing import context
from django.shortcuts import render,redirect , HttpResponse
from .models import User
import bcrypt
from django.contrib import messages

#show the main page which contains the login and the registration forms
def register(request):
    return render (request, 'index.html')

# the action of register and conditions 
def add_new_user (request):
    errors = User.objects.Register_validator(request.POST)
    request.session['coming_from']="register"
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect('/')
    else:
        password = request.POST['password']
        pw_hash = bcrypt.hashpw(password.encode(), bcrypt.gensalt()).decode()
        User.objects.create(
            first_name=request.POST['first_name'],
            last_name=request.POST['last_name'],
            email=request.POST['email'],
            password=pw_hash)
        messages.success(request, "User successfully registerd")
        # redirect to success
        return redirect('/success')

# the action of login and conditions
def log_in(request):
    errors = User.objects.login_validator(request.POST)
    request.session['coming_from']="login"
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        if (len(User.objects.filter(email=request.POST['email']))>0):
            messages.error(request, "The password is incorrect")
            if (request.POST['password'] != User.objects.get(email=request.POST['email']).password):
                messages.error(request, "The password is incorrect")
                return redirect('/')
        messages.error(request, "You are not registered yet !")
        return redirect('/')
    else:
        messages.success(request , "User successfully logged in")
        return redirect('/success')

def success(request):
    return render (request, 'result.html')

# function to clear the session when clicking on logout
def delete(request):
    del request.session['name']
    return redirect('/')
# Create your views here.

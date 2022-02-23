from django.shortcuts import render,redirect 
from .models import User
import bcrypt
from django.contrib import messages

def main(request):
    return render(request ,'index.html')


# method for registration and redirect to main page:
def register(request):
    errors = User.objects.register_validator(request.POST)
    request.session['coming_from'] = 'register'
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

def login(request):
    errors = User.objects.login_validator(request.POST)
    request.session['coming_from'] = 'login'
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        if (len(User.objects.filter(email=request.POST['email']))>0):
            messages.error(request, "The password is incorrect")
            if (request.POST['password'] != User.objects.filter(email=request.POST['email']).password):
                    messages.error(request, "The password is incorrect")
        messages.error(request, "You are not registered yet !")
        return redirect('/')
    else:
        messages.success(request , "User successfully logged in")
        return redirect('/success')

def success(request):
    return render(request , 'success.html')

# Create your views here.

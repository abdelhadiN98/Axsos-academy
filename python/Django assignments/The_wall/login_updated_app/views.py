from django.shortcuts import render,redirect,HttpResponse
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
    elif len(User.objects.filter(email=request.POST['email']))>0:
        messages.error(request, "This email already exist !")
    else:
        password = request.POST['password']
        confirm_pass = request.POST['confirm_password']
        if password == confirm_pass :
            pw_hash = bcrypt.hashpw(password.encode(), bcrypt.gensalt()).decode()
            User.objects.create(
                first_name=request.POST['first_name'],
                last_name=request.POST['last_name'],
                email=request.POST['email'],
                password=pw_hash)
            this_user = User.objects.get(email=request.POST['email'])
            request.session['user_id'] = this_user.id
        # messages.success(request, "User successfully registerd")
        # redirect to success
        return redirect('/wall')

def login(request):
    errors = User.objects.login_validator(request.POST)
    request.session['coming_from'] = 'login'
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
    if not User.objects.filter(email=request.POST['login_email']):
        messages.error(request, "not signed in! register now")
        return redirect('/')
    else:
        this_user=User.objects.get(email=request.POST['login_email'])
        if this_user:
            if bcrypt.checkpw(request.POST['login_password'].encode(), this_user.password.encode()):
                request.session['user_id'] = this_user.id
                request.session['first_name'] = this_user.first_name
                return redirect('/wall')
            else:
                messages.error(request, "the password is incorrect")
                return redirect("/")


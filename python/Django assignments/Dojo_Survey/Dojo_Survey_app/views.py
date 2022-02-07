from django.shortcuts import render , redirect

def show(request):
    return render(request,"index.html")

def result(request):
    username = request.POST['username']
    Location = request.POST['Location']
    Language = request.POST['Languages']
    comment = request.POST['comment']
    info = {
        'username' : username,
        'Location' : Location,
        'Language' : Language,
        'comment' : comment
    }
    return render(request,"results.html" , info)

def back1(request):
    return redirect("/")


from django.shortcuts import render,redirect
import random


def show(request):
    request.session['random'] = random.randint(1,100)
    print("the result is",str(request.session['random']))
    return render(request ,'game.html')

def result(request):
    request.session['value'] = request.POST['number']
    print(request.session['value'])
    if int(request.session['value']) > request.session['random']:
        request.session['result'] = "high"
        print(request.session['result'])
    elif int(request.session['value']) < request.session['random']:
        request.session['result'] = "low"
        print(request.session['result'])
    else:
        request.session['result'] = "correct"
        print(request.session['result'])
    return redirect('/')



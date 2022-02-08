from django.shortcuts import render, redirect

def show(request):
    if not "counter" in request.session:
        request.session['counter']=0
    else : 
        request.session['counter']+=1
    return render(request,'counter.html')

def clear(request):
    del request.session['counter']
    return redirect('/')

def add2(request):
    request.session['counter']+=1
    return redirect('/')

def increment(request):
    request.session['num']=int(request.POST['number'])-1
    request.session['counter']+=request.session['num']
    return redirect('/')



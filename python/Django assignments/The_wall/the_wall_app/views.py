from django.shortcuts import render,redirect
from login_updated_app.models import User,Massage,Comment


def wall(request):
    context={
        'users' : User.objects.all(),
        'massages' : Massage.objects.all().order_by("-created_at"),
        'comments' : Comment.objects.all(),
        'the_user' : User.objects.get(id=request.session['user_id'])
    }
    return render (request,'the_wall.html',context)

def post(request,the_user_id):
    Massage.objects.create(massage=request.POST['massage'],users=User.objects.get(id=the_user_id))
    return redirect ('/wall')

def comment(request,msg_id,user_id):
    Comment.objects.create(comment=request.POST['comment'],users=User.objects.get(id=user_id)
    ,massage=Massage.objects.get(id=msg_id))
    # request.session['this_massage']=msg_id
    return redirect('/wall')

# Create your views here.

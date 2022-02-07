from django.urls import path
from . import views	# the . indicates that the views file can be found in the same directory as this file
                    
urlpatterns = [
    path('', views.root),
    path('blogs', views.index),
    path('blogs/new', views.new),
    path('blogs/creat', views.creat),
    path('blogs/<number>', views.show),
    path('blogs/<number>/eddit', views.eddit),
    path('blogs/<number>/delete', views.destroy)
]
from django.urls import path
from . import views	
                    
urlpatterns = [
    path('shows/new', views.show),
    path('shows/<number>', views.read),
    path('main' , views.display),
    path('shows' , views.data),
    path('update/<num>/edit' , views.update),
    path('shows/<n>/edit' , views.edit),
    path('delete/<n>' , views.delete)
]
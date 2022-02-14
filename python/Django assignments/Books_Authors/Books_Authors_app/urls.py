from django.urls import path
from . import views	
                    
urlpatterns = [
    path('', views.show),
    path('main', views.main),
    path('add', views.add),
    path('books/<number>' , views.result),
    path('author',views.form),
    path('author/<num>',views.details)
]

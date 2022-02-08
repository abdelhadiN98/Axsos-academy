from django.urls import path
from . import views	
urlpatterns = [
    path('', views.show),
    path('result', views.add2),
    path('result2', views.clear),
    path('result3', views.increment)
    ]
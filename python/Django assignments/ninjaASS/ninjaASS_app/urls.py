from django.urls import path
from . import views
urlpatterns = [
    path('', views.show),
    path('result', views.result),
    path('result1', views.Ninja)
    # path('list', views.list)
]

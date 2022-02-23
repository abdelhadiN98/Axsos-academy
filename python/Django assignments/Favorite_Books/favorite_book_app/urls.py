from django.urls import path     
from . import views
urlpatterns = [
    path('books', views.welcome_page),
    path('add_books', views.add_books),
    path('book_details/<book_id>' , views.book_details),
    path('add/<id_book>' , views.add),
    path('unfavorite/<book_id>' , views.unfavorite),
    path('update/<book_id>' , views.update),
    path('remove/<book_id>' , views.remove),
    # path('delete' , views.delete),
]
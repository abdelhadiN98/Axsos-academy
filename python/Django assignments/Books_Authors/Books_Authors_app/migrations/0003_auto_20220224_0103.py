# Generated by Django 2.2.4 on 2022-02-23 23:03

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('Books_Authors_app', '0002_auto_20220213_1416'),
    ]

    operations = [
        migrations.AlterField(
            model_name='author',
            name='first_name',
            field=models.CharField(max_length=255, null=True),
        ),
        migrations.AlterField(
            model_name='author',
            name='last_name',
            field=models.CharField(max_length=255),
        ),
        migrations.AlterField(
            model_name='book',
            name='desc',
            field=models.TextField(null=True),
        ),
    ]

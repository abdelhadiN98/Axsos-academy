# Generated by Django 2.2.4 on 2022-02-12 18:06

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('ninjaASS_app', '0002_auto_20220212_1625'),
    ]

    operations = [
        migrations.AlterField(
            model_name='ninja',
            name='dojo',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, related_name='ninjas', to='ninjaASS_app.Dojo'),
        ),
    ]
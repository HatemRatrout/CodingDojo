# Generated by Django 2.2.5 on 2019-09-23 21:49

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('LR_app', '0002_auto_20190923_1644'),
    ]

    operations = [
        migrations.RenameField(
            model_name='user',
            old_name='ursername',
            new_name='username',
        ),
    ]

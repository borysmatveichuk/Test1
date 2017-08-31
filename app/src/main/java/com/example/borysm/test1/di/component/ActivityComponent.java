package com.example.borysm.test1.di.component;

import com.example.borysm.test1.MainActivity;
import com.example.borysm.test1.di.PerActivity;
import com.example.borysm.test1.di.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}

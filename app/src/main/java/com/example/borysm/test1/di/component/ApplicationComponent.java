package com.example.borysm.test1.di.component;

import android.app.Application;
import android.content.Context;

import com.example.borysm.test1.DemoApplication;
import com.example.borysm.test1.data.DataManager;
import com.example.borysm.test1.data.DbHelper;
import com.example.borysm.test1.data.SharedPrefsHelper;
import com.example.borysm.test1.di.ApplicationContext;
import com.example.borysm.test1.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();
}

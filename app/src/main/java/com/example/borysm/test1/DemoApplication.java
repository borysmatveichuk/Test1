package com.example.borysm.test1;

import android.app.Application;
import android.content.Context;

import com.example.borysm.test1.data.DataManager;
import com.example.borysm.test1.di.component.ApplicationComponent;
import com.example.borysm.test1.di.module.ApplicationModule;

import javax.inject.Inject;


public class DemoApplication extends Application {
    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public  ApplicationComponent getComponent() {
        return applicationComponent;
    }
}

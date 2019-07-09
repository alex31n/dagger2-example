package com.example.dagger2beginner;

import android.app.Application;

import com.example.dagger2beginner.di.ActivityComponent;
import com.example.dagger2beginner.di.AppComponent;
import com.example.dagger2beginner.di.DaggerAppComponent;

public class MyApplication extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}

package com.example.dagger2beginner.di;

import com.example.dagger2beginner.model.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
}

package com.example.dagger2beginner.di;

import com.example.dagger2beginner.model.Car;
import com.example.dagger2beginner.MainActivity;
import com.example.dagger2beginner.model.DieselEngine;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {

    Car getCar();


    void inject(MainActivity activity);

    /*@Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent (AppComponent component);

        ActivityComponent build();
    }*/
}

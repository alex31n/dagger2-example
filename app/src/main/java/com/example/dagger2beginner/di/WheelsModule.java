package com.example.dagger2beginner.di;

import com.example.dagger2beginner.model.Rims;
import com.example.dagger2beginner.model.Tires;
import com.example.dagger2beginner.model.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }
}

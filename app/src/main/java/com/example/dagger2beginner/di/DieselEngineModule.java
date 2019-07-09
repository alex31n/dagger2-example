package com.example.dagger2beginner.di;

import com.example.dagger2beginner.model.DieselEngine;
import com.example.dagger2beginner.model.Engine;
import com.example.dagger2beginner.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }
}

package com.example.dagger2beginner.di;

import com.example.dagger2beginner.model.Engine;
import com.example.dagger2beginner.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}

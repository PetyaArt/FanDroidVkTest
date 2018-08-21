package com.example.petya.fandroidvktest.di.module;

import com.example.petya.fandroidvktest.common.manager.MyFragmentManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ManagerModule {

    @Singleton
    @Provides
    MyFragmentManager provideMyFragmentManager() {
        return new MyFragmentManager();
    }

}

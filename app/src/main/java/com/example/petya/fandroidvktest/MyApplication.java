package com.example.petya.fandroidvktest;

import android.app.Application;

import com.example.petya.fandroidvktest.di.component.ApplicationComponent;
import com.example.petya.fandroidvktest.di.component.DaggerApplicationComponent;
import com.example.petya.fandroidvktest.di.module.ApplicationModule;
import com.vk.sdk.VKSdk;

public class MyApplication extends Application {

    private static ApplicationComponent sApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initComponent();
        VKSdk.initialize(this);
    }

    private void initComponent() {
        sApplicationComponent = DaggerApplicationComponent.builder().build();
    }

    public static ApplicationComponent getApplicationComponent() {
        return sApplicationComponent;
    }
}

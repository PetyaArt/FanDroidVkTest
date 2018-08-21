package com.example.petya.fandroidvktest.di.component;


import com.example.petya.fandroidvktest.di.module.ApplicationModule;
import com.example.petya.fandroidvktest.di.module.ManagerModule;
import com.example.petya.fandroidvktest.di.module.RestModule;
import com.example.petya.fandroidvktest.ui.activity.BaseActivity;
import com.example.petya.fandroidvktest.ui.activity.MainActivity;
import com.example.petya.fandroidvktest.ui.fragment.NewsFeedFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ManagerModule.class, RestModule.class})
public interface ApplicationComponent {

    void inject(BaseActivity activity);
    void inject(MainActivity activity);

    void inject(NewsFeedFragment fragment);
}

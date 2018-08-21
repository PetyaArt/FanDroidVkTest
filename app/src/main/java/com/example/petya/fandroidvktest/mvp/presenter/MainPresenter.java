package com.example.petya.fandroidvktest.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.petya.fandroidvktest.CurrentUser;
import com.example.petya.fandroidvktest.mvp.view.MainView;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    public void checkAuth() {
        if (!CurrentUser.isAuthorized()) {
            getViewState().startSingIn();
        } else {
            getViewState().signedId();
        }
    }
}

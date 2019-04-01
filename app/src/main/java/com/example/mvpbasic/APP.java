package com.example.mvpbasic;

import android.app.Application;

import com.example.mvpbasic.di.components.AppComponent;
import com.example.mvpbasic.di.components.DaggerAppComponent;
import com.example.mvpbasic.di.modules.ApplicationModule;

public class APP extends Application {

    private static AppComponent appComponent;

    public APP(){

    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}

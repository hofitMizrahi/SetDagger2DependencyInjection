package com.example.user.dagger2di;

import android.app.Application;

public class App extends Application {

    private IApplicationComponents components;

    @Override
    public void onCreate() {
        super.onCreate();

        components = DaggerIApplicationComponents.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();

    }

    public IApplicationComponents getComponents() {
        return components;
    }
}

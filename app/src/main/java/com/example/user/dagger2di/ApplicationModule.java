package com.example.user.dagger2di;
import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    // the singleton annotation - tell the
    // Dagger compiler thet the instance shuld
    // be created once in the application
    public Context provideContext(){
        return application;
    }
}

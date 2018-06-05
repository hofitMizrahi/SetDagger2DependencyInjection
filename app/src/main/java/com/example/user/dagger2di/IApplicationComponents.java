package com.example.user.dagger2di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface IApplicationComponents {

    void inject(MainActivity target);
}

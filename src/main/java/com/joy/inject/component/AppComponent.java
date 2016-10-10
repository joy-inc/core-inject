package com.joy.inject.component;

import android.app.Application;

import com.joy.inject.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton
@Component(
        modules = AppModule.class
)
public interface AppComponent {

    // Exported for child-components.
    Application application();
}

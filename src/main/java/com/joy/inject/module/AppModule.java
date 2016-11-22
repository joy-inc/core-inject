package com.joy.inject.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * A module for Android-specific dependencies which require a {@link Context} or
 * {@link Application} to create.
 */
@Module
public class AppModule {

    private final Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    /**
     * Expose the application to the graph.
     */
    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }
}

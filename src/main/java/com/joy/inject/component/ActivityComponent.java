package com.joy.inject.component;

import android.app.Activity;

import com.joy.inject.ActivityScope;
import com.joy.inject.module.ActivityModule;

import dagger.Component;

/**
 * This component inject dependencies to all Activities across the application
 */
@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = ActivityModule.class
)
public interface ActivityComponent {

    // Expose the activity to sub-graphs.
    Activity activity();
}

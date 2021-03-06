package com.joy.inject.module;

import android.app.Activity;

import com.joy.inject.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * A module to wrap the Activity state and expose it to the graph.
 */
@Module
public class ActivityModule {

    private final Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    /**
     * Expose the activity to dependents in the graph.
     */
    @Provides
    @ActivityScope
    protected Activity provideActivity() {
        return mActivity;
    }
}

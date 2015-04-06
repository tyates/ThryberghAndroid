package net.thrybergh.predictions.app;

import android.app.Application;

import net.thrybergh.predictions.app.modules.MainModule;import dagger.ObjectGraph;

public class ThryberghApplication extends Application {

    private static ObjectGraph sObjectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        sObjectGraph = ObjectGraph.create(getModules());
    }

    private Object[] getModules() {
        return new Object[] {new MainModule(this)};
    }

    public static void inject(Object target) {
        sObjectGraph.inject(target);
    }
}

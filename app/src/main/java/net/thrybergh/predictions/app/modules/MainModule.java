package net.thrybergh.predictions.app.modules;

import net.thrybergh.predictions.app.ThryberghApplication;
import net.thrybergh.predictions.network.ThryberghAPI;
import net.thrybergh.predictions.network.ThryberghAPIImpl;
import net.thrybergh.predictions.ui.LoginActivity;
import net.thrybergh.predictions.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module (
        injects = {
                MainActivity.class
        }
)
public class MainModule {

    private final ThryberghApplication mThryberghApplication;

    public MainModule(ThryberghApplication thryberghApplication) {
        mThryberghApplication = thryberghApplication;
    }

    @Provides
    public ThryberghApplication providesApplication() {
        return mThryberghApplication;
    }

    @Provides
    @Singleton
    public ThryberghAPI providesApi(ThryberghApplication application) {
        return new ThryberghAPIImpl();
    }
}

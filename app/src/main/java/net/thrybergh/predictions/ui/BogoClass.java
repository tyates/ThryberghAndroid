package net.thrybergh.predictions.ui;

import net.thrybergh.predictions.network.ThryberghAPI;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class BogoClass {
    private final ThryberghAPI mApi;

    @Inject
    public BogoClass(ThryberghAPI api) {
        mApi = api;
    }
}

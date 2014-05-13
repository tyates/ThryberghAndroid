package net.thrybergh.predictionstest;

import net.thrybergh.predictions.comms.ThryberghRequest;
import net.thrybergh.predictions.model.Shout;

import android.test.InstrumentationTestCase;

import java.util.List;

public class CommsTest extends InstrumentationTestCase {

    public void testGetShouts_success_returnsShouts() {
        List<Shout> shouts = ThryberghRequest.getShouts();
        assertNotNull(shouts);
    }

}

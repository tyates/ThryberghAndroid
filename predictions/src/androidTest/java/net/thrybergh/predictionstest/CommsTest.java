package net.thrybergh.predictionstest;

import net.thrybergh.predictions.Comms;
import net.thrybergh.predictions.model.Shout;

import android.test.InstrumentationTestCase;

import java.util.List;

public class CommsTest extends InstrumentationTestCase {

    public void testGetShouts_success_returnsShouts() {
        List<Shout> shouts = Comms.getShouts();
        assertNotNull(shouts);
    }

}

package org.transmartfoundation.status

import org.junit.Test
import static org.hamcrest.MatcherAssert.assertThat

/**
 * Created by weymouth on 1/19/16.
 */
class StatusServiceTests {

    def transmartStatusService

    @Test
    void testThatStatusServiceDoesExists() {
        println transmartStatusService
        assertThat "test: does the status server exist?" , transmartStatusService != null
    }

}

package org.transmartfoundation.status

import org.gmock.WithGMock
import org.junit.Test
import static org.hamcrest.MatcherAssert.assertThat

/**
 * Created by weymouth on 1/19/16.
 */
@WithGMock
class StatusServiceTests {

    def transmartStatusService

    @Test
    void testThatStatusServiceDoesExists() {
        assertThat "test: the status server exist?" , transmartStatusService != null
    }

    @Test
    void testThatSolrDoesNotExistsWithMockProbe() {
        ProbeSolr probe = mock(ProbeSolr)
        probe.exists().returns false;

        transmartStatusService.solrProbe = probe
        def retValue
        play {
            retValue = transmartStatusService.solrExists()
            println("Returned value = " + retValue)
        }
        assertThat "test: mocked solr probe returns false" , !retValue
    }
}

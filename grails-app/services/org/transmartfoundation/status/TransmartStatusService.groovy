package org.transmartfoundation.status

/**
 * Created by weymouth on 1/19/16.
 */
class TransmartStatusService {

    ProbeSolr solrProbe

    def TransmartStatusService(){
        solrProbe = new ProbeSolr()
    }

    def boolean solrExists() {
        println(solrProbe)
        boolean retValue = solrProbe.exists()
        println(retValue)
        return retValue
    }
}

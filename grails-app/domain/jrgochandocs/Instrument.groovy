package jrgochandocs

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.Resource

/**
 * Represents an Experimental Instrument
 */
@Secured(['ROLE_USER'])
@Resource(uri = '/api/instrument')
class Instrument {
    static auditable = true
    /**
     * User supplied acronym for the Instrument.
     */
    String abbreviation
}

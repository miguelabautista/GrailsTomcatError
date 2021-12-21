package prueba

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class BrowserInterceptorSpec extends Specification implements InterceptorUnitTest<BrowserInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test browser interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"browser")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}

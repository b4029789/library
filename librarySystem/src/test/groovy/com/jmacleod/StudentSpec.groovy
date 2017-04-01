package com.jmacleod

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void testName() {
        when: "a student does not enter a name"

	def nametest = new Student (
		name: 'john',
		email:'j@hotmail.com',
		username:'jay',
		password:'pass',
		studentId:'123abc',
		course:'Geography'
	)
	

        then: 'validation should pass'
	nametest.validate()
    }
}

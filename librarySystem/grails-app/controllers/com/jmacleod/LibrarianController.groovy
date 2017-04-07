package com.jmacleod

class LibrarianController {

    def scaffold = Librarian

    def login() {
    }

	def validate() {
		def user = Librarian.findByUsername(params.username)

		if(user && user.password == params.password) {
			session.user = user
	
			render view:'homel'
       		}

		else {
			flash.message="Invalid username and password, sorry!"

			render view:'login'
		}
	}

	def logout = {
	session.user = null

	redirect(uri:'/')

	}

	def search() {
	}

	def results() {
		def studentProps = Student.metaClass.properties*.name

	def students = Student.withCriteria {
			"${params.queryType}" {
				params.each { field, value ->
					if(studentProps.grep(field) && value) {
						ilike(field, value)
						}
			     	}
		    	}
		}	
		[students:students]
	}
}

 


   

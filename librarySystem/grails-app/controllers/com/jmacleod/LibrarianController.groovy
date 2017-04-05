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
}

 


   

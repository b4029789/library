package com.jmacleod

class StudentController {

	def scaffold = Student

	def login() { 
	}

	def validate() {
		def user = Student.findByUsername(params.username)

		if (user && user.password == params.password) {

			session.user = user

			render view:'homes'
		}

		else {
	
			flash.message = "Invalid username and password."

			render view:'login'
		}

	def logout = {

	session.user = null

	redirect(uri:'/')
	}
   }
}

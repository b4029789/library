package com.jmacleod

class BookReview {

String book
Date dateCreated
String student
String review 

// Constraints for the BookReview class

    static constraints = {	

book blank:false, nullable:false
dateCreated blank:false, nullable:false
student blank:false, nullable:false
review blank:false, nullable:false, widget: 'textarea'

    }
}

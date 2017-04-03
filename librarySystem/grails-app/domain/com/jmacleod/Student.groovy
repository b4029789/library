package com.jmacleod

class Student {

String name
String stuEmail
String username
String password
String studentID
Course course
Library library

String toString() {name}

static hasMany=[bookreview:BookReview, book:Book]
 


// Constraints for the Student class

    static constraints = {

name blank:false, nullable:false
stuEmail blank:false, nullable:false, email:true
username blank:false, nullable:false, unique:true
password blank:false, nullable:false
studentID blank:false, nullable:false
course blank:false, nullable:false

    }
}

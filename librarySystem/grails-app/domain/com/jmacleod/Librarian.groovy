package com.jmacleod

class Librarian {

String name
String officeEmail
String office
String username
String password
String telephone
String library 


// Constraints for the Librarian class

    static constraints = {

name blank:false, nullable:false
officeEmail blank:false, nullabe:false, email:true
office blank:false, nullable:false
username blank:false, nullable:false, unique:true
password blank:false, nullable:false
telephone blank:false, nullable:false
library blank:false, nullable:false
    }
}

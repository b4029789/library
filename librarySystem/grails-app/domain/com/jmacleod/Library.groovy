package com.jmacleod

class Library {

String buildingName
String address
String openingHours
String locations
String studySpaces

String toString() {buildingName}

static hasMany=[book:Book, student:Student, librarian:Librarian]

// Constraints for the Library class

    static constraints = {

buildingName blank:false, nullable:false
address blank:false, nullable:false
openingHours blank:false, nullable:false
locations blank:false, nullable:false
studySpaces blank:false, nullable:false
    }
}

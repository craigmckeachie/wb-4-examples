package com.pluralsight;


import java.time.LocalDate;

public class Person {
    //attributes
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    //constructor(s)
    //default parameterless constructor
//    public Person() {
//    }


    //getters and setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    //methods
    public String toString() {
        return firstName + " " + lastName + " " + birthDate;
    }


}

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

    //methods
    public void displayPerson(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(birthDate);
    }

}

package com.pluralsight;


import java.time.LocalDate;

public class Person {
    //attributes
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private boolean nice;

    //constructor(s)
    //default parameterless constructor
    public Person() {
    }


    public Person(String firstName, String lastName, LocalDate birthDate, boolean nice) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.nice = nice;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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

    public void setNice(boolean nice) {
        this.nice = nice;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public boolean isNice() {
        return nice;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    //methods
    public String toString() {
        return firstName + " " + lastName + " " + birthDate;
    }


}

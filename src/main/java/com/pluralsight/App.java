package com.pluralsight;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Michael");
        person.setLastName("Jordan");
        person.setBirthDate(LocalDate.of(1963, 2, 17));

        System.out.println(person);


    }
}

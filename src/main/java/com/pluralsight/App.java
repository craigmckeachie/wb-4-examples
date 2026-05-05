package com.pluralsight;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Michael");
        person.setLastName("Jordan");
        person.setBirthDate(LocalDate.of(1963, 2, 17));
        person.setNice(true);

        System.out.println(person.toString());
        //OR
        System.out.println(person);


        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getBirthDate());
        System.out.println(person.isNice());


        Person person2 = new Person("Yuliia", "Jones");
        System.out.println(person2);

        Person person3 = new Person("Luka","Doncic",LocalDate.of(1999, 2, 28),false);
        System.out.println(person3);




    }
}

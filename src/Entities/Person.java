package Entities;

import java.time.LocalDate;

public class Person {
    String ID;
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    String gender;
    String phoneNumber;
    String email;
    String address;

    public Person(String ID, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
}

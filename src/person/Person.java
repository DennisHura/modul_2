package person;

import addres.Address;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

    public String name;
    private String surname;
    public Date dateBirth;
    public Address address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public Person(){

    }

    public Person(String name, String surname, String dateBirth, Address address){
        this.name= name;
        this.surname = surname;
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

      //  = null; Date dateOne


        try {
            this.dateBirth = format.parse(String.valueOf(dateBirth));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //this.dateBirth = dateBirth;
        this.address = address;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append( " Name " + this.name + " Surname: " + this.surname + " Date of birth: " + this.dateBirth + " Address: " + this.address);
        return string.toString();
    }

    public void print() {
        System.out.println(this.toString());
    }
}

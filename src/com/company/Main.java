package com.company;

import addres.Address;
import person.Person;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address("prospect M.Lushpy 24");
        Address address2 = new Address("Vasya Lozkin street 66");
        Address address3 = new Address("Kharkovskaya 2/1 ");

        Person[] person = new Person[4];

        person[0] = new Person("Max", "Zelenuy", "21.12.1979", address1);
        person[1] = new Person("John", "Vik","23.11.1999", address2);
        person[2] = new Person("Vasya", "Pupkin", "8.03.2003", address3);
        person[3] = new Person("Vin","Dizel", "23.01.1989",address3);

        for(int i=0;i<person.length; i++){
            person[i].print();
        }

        Scanner in = new Scanner(System.in);
        String buffName;
        System.out.println("Введите имя для поиска:");
        buffName = in.nextLine();
        for(int i=0; i<person.length; i++){
            if(person[i].name == buffName ){
                person[i].print();
            }
        }

        System.out.println(buffName);
        System.out.println("Введите аддрес для поиска:");
        Address buffAddress = new Address();
        buffAddress.setAddress(in.nextLine());
        for(int i=0; i<person.length; i++){
            if(person[i].address == buffAddress ){
                person[i].print();
            }
        }

        Person personBuff = new Person();
        personBuff=person[0];
        for(int i=0; i<person.length; i++){
            personBuff =person[i];
            for(int y=0; y<person.length;y++){
                if(person[y].address==personBuff.address && personBuff.name!=person[y].name){
                    person[y].print();
                }
            }
        }

        Date date = new Date();


        Person personMax = new Person();
        personMax = person[0];
        long differenceBuff= 0;
        for(int i=0; i<person.length; i++) {
            long difference1 = date.getTime()- person[i].dateBirth.getTime();
        if(differenceBuff< difference1){
            personMax=person[i];
        }
        }
        System.out.println("Самый старый :" + personMax.name);

        Person personMin = new Person();
        personMin = person[0];
        differenceBuff= 10000000;
        for(int i=0; i<person.length; i++) {
            long difference1 = date.getTime()- person[i].dateBirth.getTime();
            if(differenceBuff> difference1){
                differenceBuff=difference1;
                personMin=person[i];
            }
        }
        System.out.println("Самый молодой :" + personMin.name);

    }
}

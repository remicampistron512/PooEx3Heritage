package fr.fms.entities;

import java.util.ArrayList;

public abstract class Person {
    public String firstName;
    public String lastName;
    public int age;
    public String address;
    public City bornCity;
    public static ArrayList<Person> personsList = new ArrayList<>();

    public Person(String firstName,String  lastName, int age, String address, City bornCity){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.bornCity = bornCity;
        personsList.add(this);
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        personsList.add(this);
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        personsList.add(this);
    }

    public  static void printWithFilter( ArrayList <Person> personsList){
        for (Person person : personsList ){
            if(person.address != null && person.address.contains("Paris") || person.bornCity != null && person.bornCity.country.contains("France")){
                System.out.println(person);
            }

        }
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        String completeDescription =  this.lastName + ","+ this.firstName + ", " + this.age + " ans,habitant à "+this.address;
        if (this.bornCity != null){
            completeDescription += ", Ville de naissance : "+ this.bornCity;
        }
        return completeDescription;
    }
    public abstract double renumeration();
}
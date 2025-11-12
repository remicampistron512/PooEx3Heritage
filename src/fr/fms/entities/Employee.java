package fr.fms.entities;

public class Employee extends Person {
    public String company;
    public int salary;

    public Employee(String firstName,String  lastName, int age, String address, City bornCity,String company,int salary){
        super(firstName,lastName,age,address,bornCity);
        this.company = company;
        this.salary = salary;

    }

    public String toString(){
        return super.toString() + ", entreprise : " + this.company + ", salaire : " + this.salary;
    }
}

package fr.fms.entities;

public class Employee extends Person {
    public String company;
    public int salary;
    public double expenses;

    public Employee(String firstName,String  lastName, int age, String address, City bornCity,String company,int salary,double expenses){
        super(firstName,lastName,age,address,bornCity);
        this.company = company;
        if(salary<0){
            throw new RuntimeException("salaire inférieur à 0 impossible");
        }
        this.salary = salary;
        this.expenses = expenses;

    }

    public String toString(){
        return super.toString() + ", entreprise : " + this.company + ", salaire : " + this.salary;
    }
    @Override
    public double renumeration(){
        return this.salary - this.expenses;
    }
}

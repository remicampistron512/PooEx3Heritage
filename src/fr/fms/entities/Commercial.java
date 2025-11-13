package fr.fms.entities;

public class Commercial extends Person {
    public String company;
    public double commissionPay;
    public Commercial(String firstName,String lastName,int age,String address,City bornCity,String company, double commissionPay){
        super(firstName,lastName,age,address,bornCity);
        this.company = company;
        if(commissionPay<0){
            throw new RuntimeException("% du chiffre d'affaire inférieur à 0 impossible");
        }
        this.commissionPay = commissionPay;
    }

    @Override
    public String toString() {
        return super.toString() + ", entreprise : " + this.company + ", %CA : " + this.commissionPay;
    }
}

package fr.fms.entities;

public class Commercial extends Person {
    public String company;
    public double commissionPay;
    public double companyRevenue;
    public Commercial(String firstName,String lastName,int age,String address,City bornCity,String company, double commissionPay,double companyRevenue){
        super(firstName,lastName,age,address,bornCity);
        this.company = company;
        if(commissionPay<0){
            throw new RuntimeException("% du chiffre d'affaire inférieur à 0 impossible");
        }
        this.commissionPay = commissionPay;
        this.companyRevenue = companyRevenue;
    }

    @Override
    public String toString() {
        return super.toString() + ", entreprise : " + this.company + ", %CA : " + this.commissionPay;
    }

    @Override
    public double renumeration() {
        return this.companyRevenue / this.commissionPay;
    }
}

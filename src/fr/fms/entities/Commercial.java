package fr.fms.entities;

/**
 * Représente un commercial, qui est une {@link Person} avec
 * une entreprise, un pourcentage de commission et un chiffre d'affaire.
 */
public class Commercial extends Person {

    /**
     * Nom de l'entreprise pour laquelle travaille le commercial.
     */
    public String company;

    /**
     * Pourcentage de commission sur le chiffre d'affaires.
     * La valeur doit être supérieure ou égale à 0.
     */
    public double commissionPay;

    /**
     * Chiffre d'affaires de l'entreprise sur lequel est calculée la commission.
     */
    public double companyRevenue;

    /**
     * Construit un nouvel objet {@code Commercial}.
     *
     * @param firstName       prénom du commercial
     * @param lastName        nom du commercial
     * @param age             âge du commercial
     * @param address         adresse du commercial
     * @param bornCity        ville de naissance du commercial
     * @param company         nom de l'entreprise
     * @param commissionPay   pourcentage de commission sur le chiffre d'affaires
     * @param companyRevenue  chiffre d'affaires pris en compte pour le calcul de la commission
     * @throws RuntimeException si {@code commissionPay} est négatif
     */
    public Commercial(String firstName, String lastName, int age, String address,
                      City bornCity, String company, double commissionPay, double companyRevenue) {
        super(firstName, lastName, age, address, bornCity);
        this.company = company;
        if (commissionPay < 0) {
            throw new RuntimeException("% du chiffre d'affaire inférieur à 0 impossible");
        }
        this.commissionPay = commissionPay;
        this.companyRevenue = companyRevenue;
    }

    /**
     * Retourne une représentation textuelle du commercial,
     * incluant les informations de la personne, de l'entreprise
     * et du pourcentage de commission.
     *
     * @return une chaîne de caractères décrivant le commercial
     */
    @Override
    public String toString() {
        return super.toString() + ", entreprise : " + this.company + ", %CA : " + this.commissionPay;
    }

    /**
     * Calcule la rémunération du commercial, correspondant
     * à la commission sur le chiffre d'affaires.
     *
     * @return la rémunération calculée comme
     *         {@code companyRevenue * commissionPay / 100}
     */
    @Override
    public double renumeration() {
        return this.companyRevenue * this.commissionPay / 100;
    }
}

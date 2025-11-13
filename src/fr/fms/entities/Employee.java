package fr.fms.entities;

/**
 * Représente un employé, qui est une {@link Person} avec
 * une entreprise, un salaire et des frais professionnels.
 * @author CampistronR
 */
public class Employee extends Person {
    /**
     * Nom de l'entreprise où travaille l'employé.
     */
    public String company;

    /**
     * Salaire annuel brut de l'employé.
     * La valeur doit être positive ou nulle.
     */
    public int salary;

    /**
     * Montant des frais ou dépenses professionnelles de l'employé.
     * Ces frais seront déduits de la rémunération.
     */
    public double expenses;

    /**
     * Construit un nouvel employé.
     *
     * @param firstName prénom de l’employé
     * @param lastName  nom de l’employé
     * @param age       âge de l’employé
     * @param address   adresse de l’employé
     * @param bornCity  ville de naissance de l’employé
     * @param company   entreprise de l’employé
     * @param salary    salaire annuel de l’employé (doit être &gt;= 0)
     * @param expenses  montant des dépenses/frais professionnels
     * @throws RuntimeException si {@code salary} est négatif
     */
    public Employee(String firstName, String lastName, int age, String address,
                    City bornCity, String company, int salary, double expenses) {
        super(firstName, lastName, age, address, bornCity);
        this.company = company;
        if (salary < 0) {
            throw new RuntimeException("salaire inférieur à 0 impossible");
        }
        this.salary = salary;
        this.expenses = expenses;
    }

    /**
     * Retourne une représentation textuelle de l’employé,
     * incluant les informations de la personne et de l’entreprise.
     *
     * @return chaîne de caractères décrivant l’employé
     */
    @Override
    public String toString() {
        return super.toString() + ", entreprise : " + this.company + ", salaire : " + this.salary;
    }

    /**
     * Calcule la rémunération de l’employé après déduction des frais.
     *
     * @return la rémunération nette, calculée comme {@code salary - expenses}
     */
    @Override
    public double renumeration() {
        return this.salary - this.expenses;
    }
}

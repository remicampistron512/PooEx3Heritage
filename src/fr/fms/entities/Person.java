package fr.fms.entities;

import java.util.ArrayList;

/**
 * Classe abstraite représentant une personne avec un prénom, un nom,
 * un âge, une adresse et éventuellement une ville de naissance.
 * <p>
 * Toutes les instances de {@code Person} (et de ses sous-classes) sont
 * automatiquement ajoutées à la liste statique {@link #personsList}.
 */
public abstract class Person {

    /**
     * Prénom de la personne.
     */
    public String firstName;

    /**
     * Nom de famille de la personne.
     */
    public String lastName;

    /**
     * Âge de la personne.
     */
    public int age;

    /**
     * Adresse de la personne.
     */
    public String address;

    /**
     * Ville de naissance de la personne.
     */
    public City bornCity;

    /**
     * Liste statique contenant toutes les personnes créées (toutes instances
     * de {@code Person} et de ses sous-classes).
     */
    public static ArrayList<Person> personsList = new ArrayList<>();

    /**
     * Constructeur principal avec tous les attributs.
     *
     * @param firstName prénom de la personne
     * @param lastName  nom de la personne
     * @param age       âge de la personne
     * @param address   adresse de la personne
     * @param bornCity  ville de naissance de la personne
     */
    public Person(String firstName, String lastName, int age, String address, City bornCity){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.bornCity = bornCity;
        personsList.add(this);
    }

    /**
     * Constructeur avec prénom, nom et âge uniquement.
     * L'adresse et la ville de naissance ne sont pas renseignées.
     *
     * @param firstName prénom de la personne
     * @param lastName  nom de la personne
     * @param age       âge de la personne
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        personsList.add(this);
    }

    /**
     * Constructeur avec prénom et nom uniquement.
     * L'âge, l'adresse et la ville de naissance ne sont pas renseignés.
     *
     * @param firstName prénom de la personne
     * @param lastName  nom de la personne
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        personsList.add(this);
    }

    /**
     * Affiche dans la console les personnes de la liste fournie qui remplissent
     * l'un des critères suivants :
     * <ul>
     *   <li>Adresse contenant la chaîne « Paris »</li>
     *   <li>Ville de naissance située en France (country contenant « France »)</li>
     * </ul>
     *
     * @param personsList liste de personnes à filtrer et à afficher
     */
    public static void printWithFilter(ArrayList<Person> personsList){
        for (Person person : personsList ){
            if (person.address != null && person.address.contains("Paris")
                    || person.bornCity != null && person.bornCity.country.contains("France")) {
                System.out.println(person);
            }
        }
    }

    /**
     * Modifie le prénom de la personne.
     *
     * @param firstName nouveau prénom
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Modifie le nom de la personne.
     *
     * @param lastName nouveau nom
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Modifie l'âge de la personne.
     *
     * @param age nouvel âge
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Modifie l'adresse de la personne.
     *
     * @param address nouvelle adresse
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retourne le prénom de la personne.
     *
     * @return le prénom
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Retourne le nom de la personne.
     *
     * @return le nom
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Retourne l'âge de la personne.
     *
     * @return l'âge
     */
    public int getAge() {
        return age;
    }

    /**
     * Retourne l'adresse de la personne.
     *
     * @return l'adresse
     */
    public String getAddress() {
        return address;
    }

    /**
     * Retourne une description textuelle de la personne, incluant
     * nom, prénom, âge, adresse et éventuellement la ville de naissance.
     *
     * @return une chaîne décrivant la personne
     */
    @Override
    public String toString() {
        String completeDescription = this.lastName + "," + this.firstName + ", " + this.age + " ans,habitant à " + this.address;
        if (this.bornCity != null){
            completeDescription += ", Ville de naissance : " + this.bornCity;
        }
        return completeDescription;
    }

    /**
     * Méthode abstraite représentant la rémunération de la personne.
     * <p>
     * Chaque sous-classe (par exemple {@code Employee}, {@code Commercial})
     * doit fournir sa propre implémentation du calcul de la rémunération.
     *
     * @return la rémunération de la personne
     */
    public abstract double renumeration();
}

package fr.fms.entities;

/**
 * Représente une ville avec un nom, un pays et une population.
 * <p>
 * La classe maintient également un compteur statique du nombre
 * total d'instances créées via l'attribut {@link #nbInstances}.
 */
public class City {

    /**
     * Nom de la ville.
     */
    public String name;

    /**
     * Pays dans lequel se trouve la ville.
     */
    public String country;

    /**
     * Population de la ville.
     * La valeur doit être supérieure ou égale à 0.
     */
    public int population;

    /**
     * Nombre d'instances de {@code City} créées.
     */
    public static int nbInstances;

    /**
     * Constructeur complet.
     *
     * @param name       nom de la ville
     * @param country    pays de la ville
     * @param population population de la ville
     */
    public City(String name, String country, int population){
        this.name = name;
        this.country = country;
        this.population = population;
        nbInstances ++;
    }

    /**
     * Constructeur avec nom et population.
     * Le pays n'est pas spécifié.
     *
     * @param name       nom de la ville
     * @param population population de la ville
     */
    public City(String name, int population){
        this.name = name;
        this.population = population;
        nbInstances ++;
    }

    /**
     * Constructeur avec nom et pays.
     * La population n'est pas spécifiée.
     *
     * @param name    nom de la ville
     * @param country pays de la ville
     */
    public City(String name,  String country){
        this.name = name;
        this.country = country;
        nbInstances ++;
    }

    /**
     * Retourne le nom de la ville.
     *
     * @return le nom de la ville
     */
    public String getName() {
        return name;
    }

    /**
     * Retourne le pays de la ville.
     *
     * @return le pays de la ville
     */
    public String getCountry() {
        return country;
    }

    /**
     * Retourne la population de la ville.
     *
     * @return la population de la ville
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Modifie le nom de la ville.
     *
     * @param name nouveau nom de la ville
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Modifie le pays de la ville.
     *
     * @param country nouveau pays de la ville
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Modifie la population de la ville.
     *
     * @param population nouvelle population (doit être ≥ 0)
     * @throws RuntimeException si la population est négative
     */
    public void setPopulation(int population) {
        if(population < 0)
            throw new RuntimeException("La population ne peut pas être négative !");
        this.population = population;
    }

    /**
     * Applique un décalage (positif ou négatif) à la population actuelle.
     *
     * @param offset valeur à ajouter à la population (peut être négative)
     * @throws RuntimeException si le résultat rend la population négative
     */
    public void offsetPopulation(int offset){
        if (offset < 0 && this.population + offset < 0){
            throw new RuntimeException("La population ne peut pas être négative !");
        } else {
            this.population += offset;
        }
    }

    /**
     * Retourne une description textuelle de la ville.
     *
     * @return une chaîne du type
     *         {@code "ville de <nom> en <pays> ayant <population>"}
     */
    public String display(){
        return "ville de " + this.name + " en " + this.country + " ayant " + this.population;
    }

    /**
     * Retourne une description courte de la ville,
     * composée de son nom et de son pays.
     *
     * @return chaîne de caractères décrivant la ville
     */
    public String toString(){
        String fullDescription =  this.name + ", " + this.country;
        //if(this.population != 0)  fullDescription += " population  " + this.population;
        return fullDescription;
    }
}

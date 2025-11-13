package fr.fms.entities;

/**
 * Représente la capitale d'un pays
 * @author CampistronR
 */
public class Capital extends City {
    /**
     * Un monument caractéristique d'une capitale
     */
    public String monument;

    /**
     * Constructeur de la classe
     * @param name nom de la ville
     * @param country pays de la ville
     * @param population population totale
     * @param monument le bom du monument associé
     */
    public Capital(String name, String country, int population, String monument){
        super(name,country,population);
        this.monument = monument;
    }

    /**
     * Permet d'afficher les infos concernant la capitale
     * @return la description de la capitale
     */
    public String toString(){
        String fullDescription =  this.name + ", " + this.country;
        if(this.population != 0)  fullDescription += ", population  " + this.population;
        fullDescription += ", " + this.monument;
        return fullDescription;
    }
}

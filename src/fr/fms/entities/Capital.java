package fr.fms.entities;

public class Capital extends City {
    public String monument;
    public Capital(String name, String country, int population, String monument){
        super(name,country,population);
        this.monument = monument;
    }

    public String toString(){
        String fullDescription =  this.name + ", " + this.country;
        if(this.population != 0)  fullDescription += ", population  " + this.population;
        fullDescription += ", " + this.monument;
        return fullDescription;
    }
}

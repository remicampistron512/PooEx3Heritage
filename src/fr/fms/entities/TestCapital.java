package fr.fms.entities;

import java.util.ArrayList;
import java.util.List;

public class TestCapital {
    public static void main (String [] args){
        List<Capital> capitals = new ArrayList<>();

        capitals.add(new Capital("Paris",        "France",           2161000,  "Tour Eiffel"));
        capitals.add(new Capital("Londres",      "Royaume-Uni",      8982000,  "Big Ben (tour Elizabeth)"));
        capitals.add(new Capital("Rome",         "Italie",           2873000,  "Colisée"));
        capitals.add(new Capital("Berlin",       "Allemagne",        3769000,  "Porte de Brandebourg"));
        capitals.add(new Capital("Madrid",       "Espagne",          3336000,  "Plaza Mayor"));
        capitals.add(new Capital("Lisbonne",     "Portugal",          545000,  "Tour de Belém"));
        capitals.add(new Capital("Athènes",      "Grèce",             664000,  "Parthénon (Acropole)"));
        capitals.add(new Capital("Le Caire",     "Égypte",           9915000,  "Pyramides de Gizeh"));
        capitals.add(new Capital("Ankara",       "Turquie",          5600000,  "Anıtkabir"));
        capitals.add(new Capital("Moscou",       "Russie",          11920000,  "Cathédrale Saint-Basile"));
        capitals.add(new Capital("Pékin",        "Chine",           21540000,  "Cité interdite"));
        capitals.add(new Capital("Tokyo",        "Japon",           13960000,  "Tokyo Skytree"));
        capitals.add(new Capital("New Delhi",    "Inde",            16790000,  "Porte de l’Inde (India Gate)"));
        capitals.add(new Capital("Washington",   "États-Unis",        705000,  "Monument de Washington"));
        capitals.add(new Capital("Ottawa",       "Canada",           1010000,  "Colline du Parlement"));
        capitals.add(new Capital("Brasília",     "Brésil",           3055000,  "Cathédrale de Brasília"));
        capitals.add(new Capital("Mexico",       "Mexique",          9200000,  "Ange de l’Indépendance"));
        capitals.add(new Capital("Vienne",       "Autriche",         1921000,  "Cathédrale Saint-Étienne"));
        capitals.add(new Capital("Amsterdam",    "Pays-Bas",          872000,  "Palais royal sur le Dam"));
        capitals.add(new Capital("Canberra",     "Australie",         462000,  "Parlement australien"));


        capitals.forEach(c -> System.out.println(c));
    }
}

package fr.fms.entities;

import java.util.ArrayList;
import java.util.List;

public class TestEntities {
    public static void main (String [] args) {

        Capital paris   = new Capital("Paris", "France", 2_160_000, "Tour Eiffel");
        City lyon       = new City("Lyon", "France", 522_000);
        City marseille  = new City("Marseille", "France", 870_000);

        Capital berlin  = new Capital("Berlin", "Allemagne", 3_600_000, "Brandenburger Tor");
        City madrid     = new City("Madrid", "Espagne", 3_200_000);
        Capital rome    = new Capital("Rome", "Italie", 2_800_000, "Colisée");



        List<Person> staff = new ArrayList<Person>(List.of(
                new Employee("Alice",   "Martin",   29, "12 rue La Boétie, 75008 Paris",  lyon,     "Acme Corp",   42000,4000),
                new Employee("Bob",     "Durand",   41, "Karl-Marx-Allee 10, Berlin",     berlin,    "Globex",      55000,7500),
                new Employee("Chloé",   "Bernard",  35, "Vieux-Port, Marseille",          marseille,"Initech",     48000,8500),
                new Commercial("Diego",   "Lopez",    32, "Calle de Alcalá 23, Madrid",     madrid,   "Hooli",       4.6,50000),
                new Commercial("Elena",   "Rossi",    27, "Via dei Fori Imperiali, Rome",   rome,     "Umbrella",    5.2,80000),
                new Commercial("François","Petit",    45, "Boulevard Voltaire, 75011 Paris",paris,    "Wayne Tech",  10.5,90000)
        ));
        System.out.println("=== Voici les employés ===");
        for (Person e : staff) {
            System.out.println(e);
        }
        for (Person e2 : staff) {
            System.out.println("Salaire mensuel de "+ e2.firstName + " " + e2.lastName + " : "+ Math.floor(e2.renumeration()));
        }
    }
}


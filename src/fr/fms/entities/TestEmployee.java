package fr.fms.entities;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
    public static void main (String [] args) {

        Capital paris   = new Capital("Paris", "France", 2_160_000, "Tour Eiffel");
        City lyon       = new City("Lyon", "France", 522_000);
        City marseille  = new City("Marseille", "France", 870_000);

        Capital berlin  = new Capital("Berlin", "Allemagne", 3_600_000, "Brandenburger Tor");
        City madrid     = new City("Madrid", "Espagne", 3_200_000);
        Capital rome    = new Capital("Rome", "Italie", 2_800_000, "Colisée");

        List<Employee> staff = new ArrayList<>(List.of(
                new Employee("Alice",   "Martin",   29, "12 rue La Boétie, 75008 Paris",  lyon,     "Acme Corp",   42000,850),
                new Employee("Bob",     "Durand",   41, "Karl-Marx-Allee 10, Berlin",     berlin,    "Globex",      55000,788),
                new Employee("Chloé",   "Bernard",  35, "Vieux-Port, Marseille",          marseille,"Initech",     48000,960),
                new Employee("Diego",   "Lopez",    32, "Calle de Alcalá 23, Madrid",     madrid,   "Hooli",       51000,879),
                new Employee("Elena",   "Rossi",    27, "Via dei Fori Imperiali, Rome",   rome,     "Umbrella",    39000,587),
                new Employee("François","Petit",    45, "Boulevard Voltaire, 75011 Paris",paris,    "Wayne Tech",  62000,896)
        ));

        System.out.println("=== Voici les employés ===");
        for (Employee e : staff) {
            System.out.println(e);
        }
    }
}

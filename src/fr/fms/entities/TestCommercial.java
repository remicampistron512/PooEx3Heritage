package fr.fms.entities;

public class TestCommercial {
    public static void main (String [] args) {
        City limoges  = new City("Limoges", "France", 133000);
        Commercial robert = new Commercial("Robert",   "Dupont",   50, "rue des rosiers à Toulouse",  limoges,     "Brico",   5.0,50000);
        System.out.println(robert);
    }
}

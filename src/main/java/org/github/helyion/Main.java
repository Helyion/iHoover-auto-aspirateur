package org.github.helyion;

public class Main {
    public static void main(String[] args) {
        Tableau tab = new Tableau(10, 10, new AspirateurClassique(5,5,Orientation.N));
        try{
            tab.getAspi().droite();
            tab.Avancer();
            tab.getAspi().droite();
            tab.Avancer();
            tab.getAspi().droite();
            tab.Avancer();
            tab.getAspi().droite();
            tab.Avancer();
            tab.Avancer();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(tab);
    }
}
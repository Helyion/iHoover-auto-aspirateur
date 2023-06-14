package org.github.helyion;

public class Main {
    public static void main(String[] args) {
        Tableau tab = new Tableau(10, 10, new AspirateurClassique(5,5,Orientation.N));
        try{
            tab.droite();
            tab.avancer();
            tab.droite();
            tab.avancer();
            tab.droite();
            tab.avancer();
            tab.droite();
            tab.avancer();
            tab.avancer();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(tab);
    }
}
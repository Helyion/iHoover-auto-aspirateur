import org.github.helyion.Aspirateur;
import org.github.helyion.Orientation;
import org.github.helyion.Tableau;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    void cas1() {
        Tableau tab = new Tableau(10, 10, new Aspirateur(5,5, Orientation.N));
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
        assertEquals("Tableau{maxX=10, maxY=10, Aspirateur{cooX=5, cooY=6, orientation=N}}", tab.toString());
    }
}

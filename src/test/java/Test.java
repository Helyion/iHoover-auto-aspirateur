import org.github.helyion.AspirateurClassique;
import org.github.helyion.Orientation;
import org.github.helyion.Tableau;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    void cas1() {
        Tableau tab = new Tableau(10, 10, new AspirateurClassique(5,5, Orientation.N));
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
        assertEquals("Tableau{maxX=10, maxY=10, Aspirateur{cooX=5, cooY=6, orientation=N}}", tab.toString());
    }
}

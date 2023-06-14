package org.github.helyion;

public class Tableau {
    private Aspirateur tab[][];
    private int maxX;
    private int maxY;

    private Aspirateur aspi;

    public Tableau(int maxX,int maxY, Aspirateur aspi){
        this.tab = new Aspirateur[maxX][maxY];
        this.maxX = maxX;
        this.maxY = maxY;
        this.aspi = aspi;
    }

    public void update(int nX, int nY) throws Exception{
        if (nX > this.maxX || nY > this.maxY || nX < 0 || nY < 0)
            throw new Exception("coordonnees hors limite");
        this.tab[this.aspi.getCooX()][this.aspi.getCooY()] = null;
        this.aspi.setCooX(nX);
        this.aspi.setCooY(nY);
        this.tab[this.aspi.getCooX()][this.aspi.getCooY()] = this.aspi;
    }

    public void avancer(){
        int x = this.aspi.getCooX();
        int y = this.aspi.getCooY();
        switch (this.aspi.getOrientation()) {
            case N -> y += 1;
            case S -> y -= 1;
            case E -> x += 1;
            case W -> x -= 1;
        }try{
            this.update(x, y);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void droite(){
        this.aspi.droite();
    }

    public void gauche(){
        this.aspi.gauche();
    }

    @Override
    public String toString() {
        return "Tableau{" +
                "maxX=" + this.maxX +
                ", maxY=" + this.maxY +
                ", " + this.aspi +
                '}';
    }
}

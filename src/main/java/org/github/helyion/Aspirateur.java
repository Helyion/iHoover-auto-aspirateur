package org.github.helyion;

public class Aspirateur {
    private int cooX;
    private int cooY;
    private Orientation orientation;
    private Tableau tableau;
    public Aspirateur(int cooX, int cooY, Orientation orientation){
        this.cooX = cooX;
        this.cooY = cooY;
        this.orientation = orientation;
    }

    public void setCooX(int cooX) {
        this.cooX = cooX;
    }

    public void setCooY(int cooY) {
        this.cooY = cooY;
    }

    public int getCooX() {
        return cooX;
    }

    public int getCooY() {
        return cooY;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public void gauche(){
        switch (this.getOrientation()) {
            case N -> this.setOrientation(Orientation.W);
            case W -> this.setOrientation(Orientation.S);
            case S -> this.setOrientation(Orientation.E);
            case E -> this.setOrientation(Orientation.N);
        }
    }

    public void droite(){
        switch (this.getOrientation()) {
            case N -> this.setOrientation(Orientation.E);
            case W -> this.setOrientation(Orientation.N);
            case S -> this.setOrientation(Orientation.W);
            case E -> this.setOrientation(Orientation.S);
        }
    }

    @Override
    public String toString() {
        return "Aspirateur{" +
                "cooX=" + cooX +
                ", cooY=" + cooY +
                ", orientation=" + orientation + '}';
    }
}

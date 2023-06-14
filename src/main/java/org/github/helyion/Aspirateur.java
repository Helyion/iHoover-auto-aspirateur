package org.github.helyion;

public abstract class Aspirateur {
    private int cooX;
    private int cooY;
    private Orientation orientation;
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

    public abstract void gauche();

    public abstract void droite();

    @Override
    public String toString() {
        return "Aspirateur{" +
                "cooX=" + cooX +
                ", cooY=" + cooY +
                ", orientation=" + orientation + '}';
    }
}

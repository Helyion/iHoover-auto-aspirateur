package org.github.helyion;

public class AspirateurClassique extends Aspirateur{

    private Orientation orientation;

    public AspirateurClassique(int cooX, int cooY, Orientation orientation){
        super(cooX, cooY, orientation);
    }

    public void droite(){
        switch (this.getOrientation()) {
            case N -> this.setOrientation(Orientation.E);
            case W -> this.setOrientation(Orientation.N);
            case S -> this.setOrientation(Orientation.W);
            case E -> this.setOrientation(Orientation.S);
        }
    }

    public void gauche(){
        switch (this.getOrientation()) {
            case N -> this.setOrientation(Orientation.W);
            case W -> this.setOrientation(Orientation.S);
            case S -> this.setOrientation(Orientation.E);
            case E -> this.setOrientation(Orientation.N);
        }
    }
}

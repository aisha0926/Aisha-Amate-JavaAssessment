package Relationships;

import java.util.Random;
import java.util.Scanner;

public class Compass extends Swamp{
    protected int location;

    public Compass(){

    }

    public Compass(int location) {
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    protected static int calcSwamp(){
        return Swamp.height * Swamp.width;
    }



}

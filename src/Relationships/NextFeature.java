package Relationships;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NextFeature extends Player {
    ArrayList<Player> val = new ArrayList<>();


    public NextFeature(){}

    public NextFeature(int a){
        this.location = a;
    }

    public NextFeature(int location, String name) {
        super(location, name);
    }

    void addPlayer(Player player){
        val.add(player);
    }






}

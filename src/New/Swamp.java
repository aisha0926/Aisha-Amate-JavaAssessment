package New;

import java.util.ArrayList;

public class Swamp extends Player {
    ArrayList<Player> val = new ArrayList<>();
    double height = 5;
    double width = 5;
    double plane;

    protected double plane(){
        return plane = height * width;
    }

    void addPlayer(Player player){
        val.add(player);
    }
}

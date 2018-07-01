package TextGame;

/*
    This class will hold the player entities, such as name and movements. This class will have the
    movements of the player.
 */

import java.util.ArrayList;

public class Player extends Compass {
    ArrayList<Player> player = new ArrayList<>();
    String name;

    public Player(){
        this.name = "Aisha";
    }

    public Player(int currentLocation, String name) {
        super(currentLocation);
        this.name = name;
    }

    void addPlayer(Player player){
        this.player.add(player);
    }

//    protected Player loopArray(Player a){
//        for(Player p: player){
//            if(p.player.contains(Outputs.line)){
//                a = p;
//                System.out.println(p);
//            }
//        }
//        return a;
//    }


    @Override
    public int getPreviousLocation() {
        return super.getPreviousLocation();
    }

    @Override
    public void setPreviousLocation(int previousLocation) {
        super.setPreviousLocation(previousLocation);
    }

    @Override
    public int getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void setCurrentLocation(int currentLocation) {
        super.setCurrentLocation(currentLocation);
    }

    @Override
    public int getTreasureLocation() {
        return super.getTreasureLocation();
    }

    @Override
    public void setTreasureLocation(int treasureLocation) {
        super.setTreasureLocation(treasureLocation);
    }
}

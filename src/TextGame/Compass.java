package TextGame;

public abstract class Compass extends Swamp {
    int previousLocation;
    int currentLocation;
    int treasureLocation;

    /*
    This class will have the calculation for the player location, to locate where the player
    is in the Swamp. It's inheriting the Swamp, in order to identify its height and width which will serve as the
    box or limitation, making sure that the player doesn't go out of the swamp.

    This class will also have the calculation for the location of the treasure.
     */
    public Compass(int currentLocation){
        this.currentLocation = currentLocation;
    }


    public int getPreviousLocation() {
        return previousLocation;
    }

    public void setPreviousLocation(int previousLocation) {
        this.previousLocation = previousLocation;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getTreasureLocation() {
        return treasureLocation;
    }

    public void setTreasureLocation(int treasureLocation) {
        this.treasureLocation = treasureLocation;
    }





}

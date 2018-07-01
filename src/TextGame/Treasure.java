package TextGame;

public class Treasure extends Compass{


    public Treasure(int currentLocation) {
        super(currentLocation);
    }

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

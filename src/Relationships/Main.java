package Relationships;

public class Main {
    public static void main(String[] args) {
        NextFeature a = new NextFeature();
        Player b = new Player();
        a.addPlayer(b);

        b.movement();

    }
}

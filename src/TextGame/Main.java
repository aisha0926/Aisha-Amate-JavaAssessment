package TextGame;

import java.util.Scanner;

import static TextGame.Outputs.scan;

public class Main {
    public static void main(String[] args) {
        Player a = new Player(0, "Aisha");
        Outputs outs = new Outputs();
        Outputs.scan.nextLine();
        a.addPlayer(a);

        a.loopArray(a);




//        outs.narrative();



    }
}

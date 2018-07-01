package TextGame;

import java.util.Scanner;

public class Outputs {
    static Scanner scan = new Scanner(System.in);
    static String line = scan.nextLine();

    void opening(){
        System.out.println("You awaken yourself in a barren moor. Try 'look'" + "\n");
    }

    void narrative(){
        System.out.println("Grey foggy clouds float oppressively close to you, reflected in the murky water which" + "\n" +
        "reaches up your shins." + "\n" + "\n" + "Some black pants barely poke out of the shallow water." + "\n" +
        "Try 'north', 'south', 'east', 'west'" + "\n" + "\n" + "You notice a small watch-like device on your left hand." + "\n"
        + "It has hands like a watch, but the hands don't seem to tell time.");
    }

    void dialOut(){
        System.out.println("The dial reads: ");
    }

    void foundTreasure(){
        System.out.println("You see a box sitting on the plain. It's filled filled with treasure! You win! The end");
    }

}

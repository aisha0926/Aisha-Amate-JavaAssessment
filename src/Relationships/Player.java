package Relationships;

import com.company.Look;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Player extends Compass {
    ArrayList<NextFeature> next = new ArrayList<>();
    String name;

    public  Player(){}

    public Player(int location){
        super(location);
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(int location, String name) {
        super(location);
        this.name = name;
    }


    /*
    Calculates the movement of the player. This is where the random assignment values is done
     */
    protected int calc() {
        Random rand = new Random();
        int ran = rand.nextInt(Compass.calcSwamp());
        this.location = ran;

        if (this.location == 15) {
            System.out.println("Found treasure");

        }

        return this.location;
    }


    protected void movement() {
        System.out.print("The adventure of Barren Moor.");
        System.out.println(" Try 'look'");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        boolean t = false;

        do{
            if (input.contains("look")) {
                StringPrinter.displayLook();
                System.out.println("The dial reads '20m'" + "");
                t = true;

            } else {

                while(!input.contains("look")) {

                    System.out.println("Invalid keyword");
                    System.out.println(" Try 'look'");
                    t = false;
                    input = scan.nextLine();
                }

            }
        } while(!t);


        /*
        Supposed to get the location of the player if it matches the stored values. Will implement in the future, at the moment
        it is just assigning random number to the player.
         */
        do {
            scan = new Scanner(System.in);
            input = scan.nextLine();
            if (input.contains("north") || input.contains("North") || input.contains("South") || input.contains("south")
                    || input.contains("East") || input.contains("east") || input.contains("East") || input.contains("east")) {
                System.out.println("The dial reads " + calc() + "");
//                    this.location = calc();
//                    if(this.location == next.size()){
//                        System.out.println("You see a box sitting on the plane. It's filled with treasure! You win. The end.");
//                    }

                if (input.contains("e")) {
                    System.out.println("You see a box sitting on the plane. It's filled with treasure! You win. The end.");
                }

            } else {

                System.out.println("Invalid input");
            }
        } while (calc() != 15);


    }

    void addFeature(NextFeature a){
        next.add(a);
    }



}

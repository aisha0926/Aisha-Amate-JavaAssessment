package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Navigation extends Plane {
    ArrayList<Player> play = new ArrayList<>();
    int[] treasure = {8,15,24};
    int plane;
    double player;


    protected double calc(){
        this.plane = Plane.height * Plane.width;
        Random rand = new Random();

            int ran = rand.nextInt(this.plane);
              player =  ran;


              if(player == 15){
                  System.out.println("Found treasure");

              }

        return player;
    }

    protected void addPlayer(Player name){
        play.add(name);
    }

    private void loopPlayer(){
        for(Player a: play){

        }
    }

    protected void movement(){
        System.out.print("The adventure of Barren Moor.");
        System.out.println(" Try 'look'");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();




        if (input.contains("look")) {
            Look.displayLook();
            System.out.println("The dial reads '20m'" + "");

        } else {
            System.out.println("Invalid keyword");
        }

        do {
           scan = new Scanner(System.in);
            input = scan.nextLine();
            if (input.contains("north") || input.contains("North") || input.contains("South") || input.contains("south")
                    || input.contains("East") || input.contains("east") || input.contains("East") || input.contains("east")) {
                System.out.println("The dial reads " + calc() + "");

                if (input.contains("e")) {
                    System.out.println("You see a box sitting on the plane. It's filled with treasure! You win. The end.");
                }

            }
        }   while (calc() != 15);

        }
        }


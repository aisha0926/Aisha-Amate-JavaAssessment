package TextGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // ArrayList<Player> player = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();

        Player a = new Player(0, "Aisha");
        Player b = new Player(0, "Al");
        a.addPlayer(a);
        a.addPlayer(b);

        player1.add("Name");
        System.out.println("Enter name: ");
   //     Scanner scan = new Scanner(System.in);
  //      String line = scan.nextLine();
       // player1.add(line);

    //    Outputs outs = new Outputs();
      //  Outputs.scan.nextLine();

        for(Player p: a.player){

           if(p.player.contains(Outputs.line)){
               System.out.println(p.name);
            }
        }
       // a.loopArray();
//        outs.narrative();
    }
}

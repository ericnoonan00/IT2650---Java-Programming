package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Location[] city = new Location[7];
        city[0] = new Location(0,0,"Cleveland1", true);
        city[1] = new Location(0,0,"Cleveland2", true);
        city[2] = new Location(0,0,"Cleveland3", false);
        city[3] = new Location(0,0,"Cleveland4", true);
        city[4] = new Location(0,0,"Cleveland5", true);
        city[5] = new Location(0,0,"Cleveland6", false);
        city[6] = new Location(0,0,"Cleveland7", false);


        Helicopter heli = new Helicopter(city[0]);

    //GAME LOOP
        boolean gameOn = true;
        while(gameOn) {
            heli.showMaxFuel();
            heli.showCurrentFuel();
            heli.showCurrentCity();
            System.out.print("""
                    Would u like to do:
                    \t- Travel to another city?(type: t)
                    \t- Refuel (type: r)
                    \t- Quit game (type: q)
                    --->""");
            char userInput = input.next().charAt(0);
            if(userInput == 't'){
                System.out.flush();
                System.out.print("""
                        What city would you like to travel to? (enter a number)\t
                        \t[1] - Cleveland1
                        \t[2] - Cleveland2
                        \t[3] - Cleveland3
                        \t[4] - Cleveland4
                        \t[5] - Cleveland5
                        \t[6] - Cleveland6
                        \t[7] - Cleveland7
                        --->""");
                int citySelect = input.nextInt() - 1;
                heli.travel(city[citySelect]);

            } else if(userInput == 'r') {
                heli.refuel();
                System.out.print("\n");
            } else if(userInput == 'q') {
                gameOn = false;
            } else {
                System.out.println("Your input was not recognized. Please try again...\n");
            }
            System.out.flush();
        }
    }
}

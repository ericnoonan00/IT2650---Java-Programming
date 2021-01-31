package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Location[] city = new Location[7];
        city[0] = new Location(0,0,"Cleveland", true);
        city[1] = new Location(500,-100,"North Pole", true);
        city[2] = new Location(-50,-50,"Campbell Hill", false);
        city[3] = new Location(-100,1000,"Tokyo", true);
        city[4] = new Location(-200,75,"Chicago", true);
        city[5] = new Location(150,0,"Erie PA", true);
        city[6] = new Location(300,-75,"Allegheny Nation Forest", false);

        double maxFuel = 0.0;
        double mpg = 0.0;
        System.out.print("Enter your desired capacity for your fuel tank: ");
        maxFuel = input.nextDouble();
        System.out.print("Enter your desired miles per gallon: ");
        mpg = input.nextDouble();

        Helicopter heli = new Helicopter(maxFuel, mpg, city[0]);

        //GAME LOOP
        boolean gameOn = true;
        while(gameOn) {
            heli.showMaxFuel();
            heli.showCurrentFuel();
            heli.showMpg();
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
                        \t[1] - Cleveland
                        \t[2] - North Pole
                        \t[3] - Campbell Hill
                        \t[4] - Tokyo
                        \t[5] - Chicago
                        \t[6] - Erie PA
                        \t[7] - Allegheny Nation Forest
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

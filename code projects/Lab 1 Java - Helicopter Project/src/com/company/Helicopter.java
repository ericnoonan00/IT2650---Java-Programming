package com.company;

public class Helicopter {
    private final double maxFuel;
    private double currentFuel;
    private final double mpg;
    private Location currentCity;
    private Location targetCity;

    public Helicopter(double maxFuel ,double mpg,Location startingCityCleveland){
        this.maxFuel = maxFuel;
        this.currentFuel = this.maxFuel;
        this.mpg = mpg;
        this.currentCity = startingCityCleveland;
    }

    public double getMaxFuel() { return maxFuel; }
    public void showMaxFuel() { System.out.println("MAX FUEL: " + getMaxFuel());}

    public double getCurrentFuel() { return currentFuel; }
    public void showCurrentFuel() { System.out.println("CURRENT FUEL: " + getCurrentFuel()); }

    public double getMpg() { return mpg; }
    public void showMpg() { System.out.println("MPG: " + getMpg()); }

    public Location getCurrentCity() { return currentCity; }
    public void showCurrentCity() { System.out.println("You are currently located in " + getCurrentCity());}

    public Location getTargetCity() { return targetCity; }

    public void refuel() {
        boolean CityHasFuel = currentCity.getHasFuel();
        if (this.currentFuel == this.maxFuel) {
            System.out.println("Your tank is already full.");
        } else if (CityHasFuel) {
            this.currentFuel = maxFuel;
            System.out.println("Your fuel tank is now full!");
        } else {
            System.out.println("Your current city has no gas stations.");
        }
    }



    public void travel(Location targetCity){
        double distance = targetCity.getDistBetweenCities(this.currentCity, targetCity);
        this.currentFuel = this.currentFuel - (distance / mpg); //pretty sure that's how you calculate that lol

        this.currentCity = targetCity;
    }
}

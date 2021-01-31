package com.company;

public class Helicopter {
    private double maxFuel;
    private double currentFuel;
    private Location currentCity;
    private Location targetCity;

    public Helicopter(Location startingCity){
        maxFuel = 100;
        currentFuel = 80;
        this.currentCity = startingCity;
    }

    public double getMaxFuel() { return maxFuel; }
    public void showMaxFuel() { System.out.println("MAX FUEL: " + getMaxFuel());}

    public double getCurrentFuel() { return currentFuel; }
    public void showCurrentFuel() { System.out.println("Your fuel is currently at: " + getCurrentFuel()); }

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
        this.currentCity = targetCity;
    }
}
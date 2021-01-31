package com.company;

public class Location {
    private final String name;
    private final double x;
    private final double y;
    private final boolean hasFuel;

    public String getName() { return name; }

    public double getX() { return x; }

    public double getY() { return y; }

    public boolean getHasFuel() { return hasFuel; }

    public Location(int x, int y, String name, boolean hasFuel) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.hasFuel = hasFuel;
    }

    public double getDistBetweenCities(Location cCity, Location tCity){
        double distance;
        distance = Math.sqrt((Math.pow(tCity.x - cCity.x, 2) + Math.pow(tCity.y - cCity.y, 2)));       //d=√((x_2-x_1)²+(y_2-y_1)²)
        System.out.println("Distance Traveled: " + distance);
        return distance;
    }

    public String toString() {
        return this.name;
    }
}

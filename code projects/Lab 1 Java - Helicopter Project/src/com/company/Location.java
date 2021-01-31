package com.company;

public class Location {
    private String name;
    private int x;
    private int y;
    private boolean hasFuel;

    public String getName() { return name; }

    public int getX() { return x; }

    public int getY() { return y; }

    public boolean getHasFuel() { return hasFuel; }

    public Location(int x, int y, String name, boolean hasFuel){
        this.x = x;
        this.y = y;
        this.name = name;
        this.hasFuel = hasFuel;
    }

    public String toString(){
        String x = this.name;
        return x;
    }
}
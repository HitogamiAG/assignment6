package com.assignment6.part3.houses;
import com.assignment6.part3.components.Garage;
import com.assignment6.part3.components.Garden;
import com.assignment6.part3.components.Statues;
import com.assignment6.part3.components.SwimPool;
public class House {
    private final int windows;
    private final int doors;
    private final int rooms;
    private final Garage garage;
    private final SwimPool swimPool;
    private final Statues statues;
    private final Garden garden;

    public House(int rooms, int doors, int windows, Garden garden, Garage garage, Statues statues, SwimPool swimPool){
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.garage = garage;
        this.swimPool = swimPool;
        this.statues = statues;
        this.garden = garden;
    }

    public Garage getGarage() {
        return garage;
    }

    public Garden getGarden() {
        return garden;
    }

    public int getDoors() {
        return doors;
    }

    public int getRooms() {
        return rooms;
    }

    public int getWindows() {
        return windows;
    }

    public Statues getStatues() {
        return statues;
    }

    public SwimPool getSwimPool() {
        return swimPool;
    }
}

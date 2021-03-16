package com.assignment6.part3.houses;
import com.assignment6.part3.components.Garage;
import com.assignment6.part3.components.Garden;
import com.assignment6.part3.components.Statues;
import com.assignment6.part3.components.SwimPool;

public class Manual {
    private final int windows;
    private final int doors;
    private final int rooms;
    private final Garage garage;
    private final SwimPool swimPool;
    private final Statues statues;
    private final Garden garden;

    public Manual(int rooms, int doors, int windows, Garden garden, Garage garage, Statues statues, SwimPool swimPool){
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.garage = garage;
        this.swimPool = swimPool;
        this.statues = statues;
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", rooms=" + rooms +
                ", hasGarage=" + garage +
                ", hasSwimPool=" + swimPool +
                ", hasStatues=" + statues +
                ", hasGarden=" + garden +
                '}';
    }
}

package com.assignment6.part3.builders;

import com.assignment6.part3.builders.interfaces.Builder;
import com.assignment6.part3.houses.House;
import com.assignment6.part3.components.Garage;
import com.assignment6.part3.components.Garden;
import com.assignment6.part3.components.Statues;
import com.assignment6.part3.components.SwimPool;
import com.assignment6.part3.houses.Manual;

public class HouseManualBuilder implements Builder {
    private int windows;
    private int doors;
    private int rooms;
    private Garage garage;
    private SwimPool swimPool;
    private Statues statues;
    private Garden garden;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    public void setStatues(Statues statues) {
        this.statues = statues;
    }

    public void setSwimPool(SwimPool swimPool) {
        this.swimPool = swimPool;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public Manual getResult(){
        return new Manual(rooms, doors, windows, garden, garage, statues, swimPool);
    }
}

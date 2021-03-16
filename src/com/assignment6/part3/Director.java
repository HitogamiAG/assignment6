package com.assignment6.part3;

import com.assignment6.part3.builders.interfaces.Builder;
import com.assignment6.part3.components.Garage;
import com.assignment6.part3.components.Garden;
import com.assignment6.part3.components.Statues;
import com.assignment6.part3.components.SwimPool;

public class Director {

    public void buildPoorHouse(Builder builder){
        builder.setDoors(2);
        builder.setRooms(2);
        builder.setWindows(4);
        builder.setGarage(new Garage(false));
        builder.setGarden(new Garden(false));
        builder.setSwimPool(new SwimPool(false));
        builder.setStatues(new Statues(false));
    }

    public void buildCasualHouse(Builder builder){
        builder.setDoors(3);
        builder.setRooms(4);
        builder.setWindows(10);
        builder.setGarage(new Garage(true));
        builder.setGarden(new Garden(true));
        builder.setSwimPool(new SwimPool(false));
        builder.setStatues(new Statues(false));
    }

    public void buildRichHouse(Builder builder){
        builder.setDoors(5);
        builder.setRooms(8);
        builder.setWindows(16);
        builder.setGarage(new Garage(true));
        builder.setGarden(new Garden(true));
        builder.setSwimPool(new SwimPool(true));
        builder.setStatues(new Statues(true));
    }

}

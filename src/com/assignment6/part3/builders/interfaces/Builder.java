package com.assignment6.part3.builders.interfaces;

import com.assignment6.part3.components.Garage;
import com.assignment6.part3.components.Garden;
import com.assignment6.part3.components.Statues;
import com.assignment6.part3.components.SwimPool;

public interface Builder {
    void setDoors(int doors);
    void setGarage(Garage garage);
    void setGarden(Garden garden);
    void setStatues(Statues statues);
    void setSwimPool(SwimPool swimPool);
    void setWindows(int windows);
    void setRooms(int rooms);
}

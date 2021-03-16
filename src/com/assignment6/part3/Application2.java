package com.assignment6.part3;

import com.assignment6.part3.Director;
import com.assignment6.part3.builders.HouseBuilder;
import com.assignment6.part3.builders.HouseManualBuilder;
import com.assignment6.part3.houses.House;
import com.assignment6.part3.houses.Manual;

public class Application2 {
    public void start(){
        Director director = new Director();

        HouseBuilder builder = new HouseBuilder();
        director.buildCasualHouse(builder);
        House house = builder.getResult();
        System.out.println("House built: Casual");


        HouseManualBuilder manualBuilder = new HouseManualBuilder();
        director.buildCasualHouse(manualBuilder);
        Manual houseManual = manualBuilder.getResult();
        System.out.println("House manual built:" + houseManual.toString());

    }

}

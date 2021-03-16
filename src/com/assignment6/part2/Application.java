package com.assignment6.part2;

import com.assignment6.part2.factory.LandShipment;
import com.assignment6.part2.factory.SeaShipment;
import com.assignment6.part2.factory.Shipment;


public class Application {
    private static Shipment shipment;


    public Application(){
        configure();
        runBusinessLogic();
    }

    static void configure(){
        int opt = 1;
        if(opt == 1){
            shipment = new LandShipment();
        } else {
            shipment = new SeaShipment();
        }
    }

    static void runBusinessLogic(){
        shipment.newTicket();
    }

}

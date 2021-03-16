package com.assignment6.part2.factory;
import com.assignment6.part2.shipment.interfaces.Delivery;

public abstract class Shipment {

    public void newTicket(){
        /* some code */
        Delivery newDelivery = createDelivery();
        newDelivery.createTicket();
    }

    public abstract Delivery createDelivery();

}

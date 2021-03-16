package com.assignment6.part2.shipment;

import com.assignment6.part2.shipment.interfaces.Delivery;

public class LandDelivery implements Delivery {

    @Override
    public void createTicket() {
        System.out.println("Creating your ticket...");
        System.out.println("Sending your ticket to the server...");
        System.out.println("All is ok");
        deliver();
    }

    @Override
    public void deliver() {
        System.out.println("Your cargo is delivered by land...");
    }
}

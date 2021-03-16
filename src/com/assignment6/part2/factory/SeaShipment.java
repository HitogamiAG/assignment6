package com.assignment6.part2.factory;

import com.assignment6.part2.shipment.interfaces.Delivery;
import com.assignment6.part2.shipment.SeaDelivery;

public class SeaShipment extends Shipment {
    @Override
    public Delivery createDelivery() {
        return new SeaDelivery();
    }
}

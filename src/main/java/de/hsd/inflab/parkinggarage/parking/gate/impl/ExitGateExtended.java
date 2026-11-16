package de.hsd.inflab.parkinggarage.parking.gate.impl;

import de.hsd.inflab.parkinggarage.models.Receipt;
import de.hsd.inflab.parkinggarage.models.vehicles.VehicleTypes;
import de.hsd.inflab.parkinggarage.parking.gate.iface.Exit;
import de.hsd.inflab.parkinggarage.simulator.SimClock;


import java.time.Duration;
import java.time.LocalDateTime;

public class ExitGateExtended implements Exit{
    
    public Receipt processOutgoing(SimClock clock, LocalDateTime timeStamp, VehicleTypes type){
        if (Math.abs(Duration.between(timeStamp, clock.now()).toMinutes()) < 15){
            return new Receipt(0, Duration.between(timeStamp, clock.now()), type );
        }
        else{
            if (type == VehicleTypes.CAR){
                int price = (int) (2*Math.ceil(Math.abs((Duration.between(timeStamp, clock.now()).toMinutes()/60.0))));
                return new Receipt(price , Duration.between( timeStamp, clock.now()), type);
            }
            else if ( type == VehicleTypes.MOTORCYCLE){
                int price = (int) (2*Math.ceil(Duration.between(timeStamp, clock.now()).toMinutes()/60.0) - 1);
                return new Receipt(price , Duration.between( timeStamp, clock.now()), type);
            }
            else{
                int price = (int) (2*Math.ceil(Duration.between(timeStamp, clock.now()).toMinutes()/60.0) + 5);
                return new Receipt(price , Duration.between( timeStamp, clock.now()), type);
            }
        }
    }
}

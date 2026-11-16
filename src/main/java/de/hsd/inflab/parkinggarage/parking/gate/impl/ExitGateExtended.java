package de.hsd.inflab.parkinggarage.parking.gate.impl;

import de.hsd.inflab.parkinggarage.models.Receipt;
import de.hsd.inflab.parkinggarage.models.vehicles.VehicleTypes;
import de.hsd.inflab.parkinggarage.parking.gate.iface.Exit;

import java.time.Duration;
import java.time.LocalDateTime;

public class ExitGateExtended implements Exit{
    
    public Receipt processOutgoing(LocalDateTime currentTime, LocalDateTime timeStamp, VehicleTypes type){
        if (Duration.between(timeStamp, currentTime).toMinutes() < 15){
            return new Receipt(0, Duration.between(timeStamp, currentTime), type );
        }
        else{
            if (type == VehicleTypes.CAR){
                int price = (int) Math.round(2*Duration.between(timeStamp, currentTime).toHours());
                return new Receipt(price , Duration.between( timeStamp, currentTime), type);
            }
            else if ( type == VehicleTypes.MOTORCYCLE){
                int price = (int) Math.round(2*Duration.between(timeStamp, currentTime).toHours()) - 1;
                return new Receipt(price , Duration.between( timeStamp, currentTime), type);
            }
            else{
                int price = (int) Math.round(2*Duration.between(timeStamp, currentTime).toHours()) + 5;
                return new Receipt(price , Duration.between( timeStamp, currentTime), type);
            }
        }
    }
}

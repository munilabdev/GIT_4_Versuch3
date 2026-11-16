package de.hsd.inflab.parkinggarage.parking.gate.impl;

import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.VehicleTypes;
import de.hsd.inflab.parkinggarage.parking.gate.iface.Entrance;

import java.time.LocalDateTime;

public class EntranceGateExtended implements Entrance {
    
    public Ticket processIncoming(boolean isFull, VehicleTypes type, double occupancy){
        if (isFull){
            return Ticket.denyEntry("No parking lot available.");
        }
        else if ( type == VehicleTypes.SEMI && occupancy >= 0.8){
            return Ticket.denyEntry("Occupancy over 80%. No Semis allowed anymore.");
        }
        else{
            return Ticket.issue(LocalDateTime.of(2026, 10, 6, 12, 0));
        }

    }
}

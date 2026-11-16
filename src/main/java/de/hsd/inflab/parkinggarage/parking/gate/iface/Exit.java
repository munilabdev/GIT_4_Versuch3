package de.hsd.inflab.parkinggarage.parking.gate.iface;

import de.hsd.inflab.parkinggarage.models.Receipt;
import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.*;
import de.hsd.inflab.parkinggarage.simulator.SimClock;


import java.time.LocalDateTime;

public interface Exit {
    public Receipt processOutgoing(SimClock clock, LocalDateTime timeStamp, VehicleTypes type);
}

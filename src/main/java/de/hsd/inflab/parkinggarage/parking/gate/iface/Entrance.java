package de.hsd.inflab.parkinggarage.parking.gate.iface;

import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.*;
import de.hsd.inflab.parkinggarage.simulator.SimClock;

import java.time.LocalDateTime;

public interface Entrance {
    public Ticket processIncoming(boolean isFull, VehicleTypes type, double occupancy, SimClock clock);
}

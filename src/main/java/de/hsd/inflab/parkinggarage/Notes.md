### Hilfe zu Aufgabe 1

| Nr. | benötigte Information | Bereitsteller (Klasse/Getter) |
|-----|-----------------------|-------------------------------|
|  1  |  Parkhausauslastung   |    Lot.isFull()         |
|  2  |Aus 1, und Art des Fahrzeugs bei Einfahrt|Vehicle.getVehicleType() und Lot.calculateOccupancy()|
|  3  |Dauer des Parkes|SimClock.now() und ValidTicket.getTimeStamp()|
|  4  |Art des Fahrzeugs und Dauer des Aufenthalts|Vehucle.getVehicleType() und getter aus 3|
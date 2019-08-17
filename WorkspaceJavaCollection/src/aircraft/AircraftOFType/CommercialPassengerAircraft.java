package aircraft.AircraftOFType;

public abstract class CommercialPassengerAircraft extends Aircraft {
private final Integer seatingCapacity;
private final Integer cargoCapacity;

public CommercialPassengerAircraft (int seatingCapacity,int cargoCapacity,String aircraftManufacturer, String aircraftModel, int flightRange, int fuelConsumption) {

    super(aircraftManufacturer, aircraftModel, flightRange, fuelConsumption);
    this.seatingCapacity=seatingCapacity;
    this.cargoCapacity=cargoCapacity;
}

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public int getCargoCapacity() {
        return cargoCapacity;
    }
}









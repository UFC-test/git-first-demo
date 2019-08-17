package aircraft.AircraftOFType;

public class LightPassengerAircraft extends Aircraft {
    private Integer seatingCapacity;
    public LightPassengerAircraft (String aircraftManufacturer, String aircraftModel, int flightRange, int fuelConsumption, int seatingCapacity){
        super (aircraftManufacturer, aircraftModel, flightRange, fuelConsumption);
        this.seatingCapacity=seatingCapacity;

    }

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public int getCargoCapacity() {
        return 0;
    }
}

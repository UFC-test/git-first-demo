package aircraft.AircraftOFType;

public abstract class CargoAircraft extends Aircraft {
    private Integer cargoCapacity;
public CargoAircraft (String aircraftManufacturer, String aircraftModel, int flightRange, int fuelConsumption, int cargoCapacity){
   super(aircraftManufacturer, aircraftModel, flightRange,fuelConsumption);
   this.cargoCapacity=cargoCapacity;

}

    @Override
    public int getSeatingCapacity() {
        return 0;
    }

    @Override
    public int getCargoCapacity() {
        return cargoCapacity;
    }
}

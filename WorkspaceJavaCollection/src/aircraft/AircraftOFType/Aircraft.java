package aircraft.AircraftOFType;

public abstract class Aircraft {
    private final String aircraftManufacturer;
    private final String aircraftModel;
    private final int flightRange;
    private final int fuelConsumption;

    public Aircraft (String aircraftManufacturer, String aircraftModel, int flightRange, int fuelConsumption){
        this.aircraftManufacturer=aircraftManufacturer;
        this.aircraftModel=aircraftModel;
        this.flightRange=flightRange;
        this.fuelConsumption=fuelConsumption;
    }
public abstract int getSeatingCapacity();
public abstract int getCargoCapacity();

public String getAircraftManufacturer() {
    return aircraftManufacturer;
}
public String getAircraftModel() {
        return aircraftModel;
}
public  int getFlightRange() {
        return flightRange;
}
public  int getFuelConsumption() {
        return fuelConsumption;
}

    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftManufacturer=" + aircraftManufacturer +
                ", aircraftModel=" + aircraftModel +
                ", seatingCapacity=" + getSeatingCapacity() +
                ", cargoCapacity=" + getCargoCapacity() +
                ", flightRange=" + flightRange +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}

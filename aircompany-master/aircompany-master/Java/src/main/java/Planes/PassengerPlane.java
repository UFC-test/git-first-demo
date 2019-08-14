package Planes;
import java.util.Objects;

public class PassengerPlane extends Plane{

     private int MaximumNumberOfPassengers;

     public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int maximumNumberOfPassengers) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.MaximumNumberOfPassengers = maximumNumberOfPassengers;
    }
    public int getMaximumNumberOfPassengers() {
        return maximumNumberOfPassengers;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", maximumNumberOfPassengers=" + maximumNumberOfPassengers +
                '}');
    }
    @Override
    public boolean equals(Object Aircraft) {
        if (this == Aircraft) return true;
        if (!(Aircraft instanceof PassengerPlane),super.equals(Aircraft)) return false;
        PassengerPlane plane = (PassengerPlane) Aircraft;
        return maximumNumberOfPassengers == plane.maximumNumberOfPassengers;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maximumNumberOfPassengers);
    }
}

package Planes;

import models.MilitaryTypePlanes;
import java.util.Objects;

public class MilitaryPlane extends Plane{
    private MilitaryTypePlanes = new militarytype;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int militarytype) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militarytype = militarytype;
    }
    public MilitaryTypePlanes getType() {
        return militarytype;
    }
    @Override
    public String toString() {
        return super.toString().replace("}",
                ", militarytype=" + militarytype +
                '}');
    }
    @Override
    public boolean equals(Object Aircraft) {
        if (this == Aircraft) return true;
        if (!(Aircraft instanceof MilitaryPlane)) return false;
        if (!super.equals(Aircraft)) return false;
        MilitaryPlane that = (MilitaryPlane) Aircraft;
        return militarytype == that.militarytype;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militarytype);
    }
}

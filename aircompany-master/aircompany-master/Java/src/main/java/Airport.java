import Planes.experimentalPlane;
import models.MilitaryTypePlanes;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;
import java.util.*;

public class Airport {
    private List<? extends Plane> planes;

    public List<PassengerPlane> getpassengerPlaneRepublicOfBelarus() {
        List<? extends Plane> l = this.planes;
        List<PassengerPlane> jet = new ArrayList<>();
        for (Plane airplane : l) {if (airplane instanceof PassengerPlane) {jet.add((PassengerPlane) airplane);}}
        return jet;
    }
    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if !(plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            return militaryPlanes;
    }
    public PassengerPlane getPassengerPlaneWithMaximumNumberOfPassengers() {
        List<PassengerPlane> maximumNumberOfPassengers = getpassengerPlaneRepublicOfBelarus();
        PassengerPlane planeWithMaximumNumberOfPassengers = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getMaximumNumberOfPassengers() > planeWithMaximumNumberOfPassengers.getMaximumNumberOfPassengers()) {
                planeWithMaximumNumberOfPassengers = passengerPlanes.get(i);
            }
        }
        return planeWithMaximumNumberOfPassengers;
    }
    public List<MilitaryPlane> getTransportMilitaryPlanes() {
    List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
    for (int i = 0; i < militaryPlanes.size(); i++) {
    MilitaryPlane plane = militaryPlanes.get(i);
    if (plane.getType() == MilitaryTypePlanes.TRANSPORT) {
    transportMilitaryPlanes.add(plane);
    }
    }
    return transportMilitaryPlanes;
    }
    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryTypePlanes.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;
    }
    public List<experimentalPlane> getExperimentalPlanes() {
        List<experimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof experimentalPlane) {
                experimentalPlanes.add((experimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }
    public Airport sortByMaxDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane AircraftAirbus, Plane AircraftBoeing) {
                return AircraftAirbus.Get_Max_Flight_Distance() - AircraftBoeing.Get_Max_Flight_Distance();
            }
        });
        return this;
    }
    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane AircraftAirbus, Plane AircraftBoeing) {
                return AircraftAirbus.getMaxSpeed() - AircraftBoeing.getMaxSpeed();
            }
        });
        return this;
    }
    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane AircraftAirbus, Plane AircraftBoeing) {
                return AircraftAirbus.getMinLoadCapacity() - AircraftBoeing.getMinLoadCapacity();
            }
        });
        return this;
    }
    public List<? extends Plane> getPlanes() {
        return planes;
    }
    private void print(CollectionPlane<? extends Plane> collectionPlane) {
        Iterator<? extends Plane> iterator = collectionPlane.iterator();
        while (iterator.hasNext()) {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }
    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }
    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }
}

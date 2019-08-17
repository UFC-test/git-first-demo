package aircraft.Airline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;
import aircraft.AircraftOFType.AircraftCompare;
import aircraft.AircraftOFType.Aircraft;

public class Airline {
    private String airlineName;
    private List<Aircraft> aircrafts = new ArrayList<Aircraft> ();

    public Airline(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }
    public void calculateTotalCargoPassengerCapecity(){
        int totalPassengerCapacity = 0;
        int totalCargoCapacity = 0;
        for (int i=0; i<aircrafts.size ();++i){
            totalPassengerCapacity += aircrafts.get (i).getSeatingCapacity ();
            totalCargoCapacity += aircrafts.get (i).getCargoCapacity ();
        }
        System.out.println ("Total passenger capacity " + totalPassengerCapacity);
        System.out.println ("Total cargo capacity " + totalCargoCapacity);
    }
    public void sortPlanesByFlightRange (){
    Collections.sort (this.aircrafts, new AircraftCompare ());
}
    public ArrayList<Aircraft>filterAircraftsByFuelConsumption (int min, int max, boolean ResultCheck) {
        ArrayList<Aircraft> ResultByFuelConsumption= new ArrayList<Aircraft> ();
        for (int i = 0; i < this.aircrafts.size(); ++i) {
            int planeConsumption = aircrafts.get(i).getFuelConsumption();
            if (planeConsumption >= min && planeConsumption <= max) {
                ResultByFuelConsumption.add(aircrafts.get(i));
            }
        }
        if (ResultCheck == true) {
            showAircraftList(ResultByFuelConsumption);
        }

        return ResultByFuelConsumption;
    }

    public void showAirlineAircrafts() {
        showAircraftList(this.aircrafts);
    }

    private void showAircraftList(List<Aircraft> al) {
        System.out.println("----- " + this.getAirlineName() + " -----");
        for (int i = 0; i < al.size(); ++i) {
            System.out.println(al.get(i));
        }
    }
}


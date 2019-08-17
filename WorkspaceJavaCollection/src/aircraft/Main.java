package aircraft;

import aircraft.model.*;
import aircraft.AircraftOFType.Aircraft;
import aircraft.Airline.Airline;

public class Main {
    public static void main(String[] args) {
        Aircraft aircraftAirbusA320a = new AircraftAirbusA320 ();
        Aircraft aircraftAirbusA320b = new AircraftAirbusA320 ();
        Aircraft aircraftBoeing = new AircraftBoeing737 ();
        Aircraft aircraftCessna = new AircraftCessna172 ();
        Aircraft aircraftDouglas = new AircraftDouglasMD11F ();

        Airline belarussianAirline = new Airline("Belarussian Airlines");
        belarussianAirline.addAircraft(aircraftAirbusA320a);
        belarussianAirline.addAircraft(aircraftAirbusA320b);
        belarussianAirline.addAircraft(aircraftDouglas);
        belarussianAirline.addAircraft(aircraftCessna);
        belarussianAirline.addAircraft(aircraftBoeing);

        System.out.println("Aircrafts sorted by flight range:");
        belarussianAirline.sortPlanesByFlightRange();
        belarussianAirline.showAirlineAircrafts();
        System.out.println();

        belarussianAirline.filterAircraftsByFuelConsumption (1500,3000,true);
        System.out.println();

        belarussianAirline.calculateTotalCargoPassengerCapecity();
    }

}
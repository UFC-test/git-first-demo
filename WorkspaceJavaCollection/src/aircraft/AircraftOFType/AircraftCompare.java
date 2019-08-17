package aircraft.AircraftOFType;
import java.util.Comparator;

public class AircraftCompare implements Comparator <Aircraft> {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return new Integer (o1.getFlightRange ()).compareTo (o2.getFlightRange ());
    }
}

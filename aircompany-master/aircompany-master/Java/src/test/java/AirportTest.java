import Planes.experimentalPlane;
import models.ClassificationLevelsSecurityOfThePlanes;
import models.ExperimentalTypesOfThePlanes;
import models.MilitaryTypePlanes;
import org.testng.Assert;
import org.testng.annotations.Test;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;
import java.util.Arrays;
import java.util.List;

public class AirportTest {
    private static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryTypePlanes.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryTypePlanes.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryTypePlanes.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryTypePlanes.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryTypePlanes.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryTypePlanes.TRANSPORT),
            new experimentalPlane("Bell X-14", 277, 482, 500, ExperimentalTypesOfThePlanes.HIGH_ALTITUDE, ClassificationLevelsSecurityOfThePlanes.SECRET),
            new experimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalTypesOfThePlanes.VTOL, ClassificationLevelsSecurityOfThePlanes.TOP_SECRET)
    );
    private static PassengerPlane planeWithMaxMaximumNumberOfPassengers = new PassengerPlane("Boeing-747", 980, 16100, 70500, 242);

    @Test
    public void testGetTransportMilitaryPlanes() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();
        for (MilitaryPlane militaryPlane : transportMilitaryPlanes) {
            if !((militaryPlane.getType() == MilitaryTypePlanes.TRANSPORT)) {
                boolean =  false;
                break;
            }
        }
        Assert.assertEquals(true);
    }
    @Test
    public void testGetPassengerPlaneWithMaximumNumberOfPassengers() {
        System.out.println("TEST testGetPassengerPlaneWithMaximumNumberOfPassengers started!");
        Airport airport = new Airport(planes);
        PassengerPlane expectedPlaneWithMaximumNumberOfPassengers = airport.getPassengerPlaneWithMaximumNumberOfPassengers();
        Assert.assertTrue(expectedPlaneWithMaximumNumberOfPassengers.equals(planeWithMaximumNumberOfPassengers));
    }
    @Test
    public void testPlanesSortedByMaxLoadCapacity() {
        Airport airport = new Airport(planes);
        airport.sortByMaxLoadCapacity();
        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.getPlanes();
        for (int i = 0; i < planesSortedByMaxLoadCapacity.size() - 1; i++) {
            Plane currentPlane = planesSortedByMaxLoadCapacity.get(i);
            Plane nextPlane = planesSortedByMaxLoadCapacity.get(i + 1);
            if !(currentPlane.getMinLoadCapacity() > nextPlane.getMinLoadCapacity()) {
               boolean nextPlaneMaxLoadCapacityIsHigherThanCurrent = true;
                break;
            }
        }
        Assert.assertTrue(nextPlaneMaxLoadCapacityIsHigherThanCurrent);
    }
    @Test
    public void testHasAtLeastOneBomberInMilitaryPlanes() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();
        for (MilitaryPlane militaryPlane : bomberMilitaryPlanes) {
            if !((militaryPlane.getType() == MilitaryTypePlanes.BOMBER)) {
                boolean = false;
            }
        }
    }
    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified(){
        Airport airport = new Airport(planes);
        List<experimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        for(experimentalPlane experimentalPlane : experimentalPlanes){
            if !(experimentalPlane.getClassificationLevelsSecurityOfThePlanes() == ClassificationLevelsSecurityOfThePlanes.UNCLASSIFIED){
                boolean hasUnclassifiedPlanes = false;
                break;
            }
        }
        Assert.assertFalse(hasUnclassifiedPlanes);
    }
}

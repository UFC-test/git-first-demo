
import java.util.*;
import java.util.List;

public class Car {

    private static int cntCar;
    private static List<Car> listCar = new ArrayList<Car>();
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private long cost;
    private String registration_of_number;

    public Car(String brand, String model, int year, String color, double cost, String registration_of_number) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setColor(color);
        setCost(cost);
        setRegistrationNo (registration_of_number);

        this.id = cntCar;
    }
    private static int getCurrentYear() {
        java.util.Calendar calendar = java.util.Calendar.getInstance (java.util.TimeZone.getDefault (), java.util.Locale.getDefault ());
        calendar.setTime (new java.util.Date ());
        return calendar.get (java.util.Calendar.YEAR);
    }

        public static void filterCar(String brand) {
            for (Car currentCar : listCar) {
                if (currentCar.getBrand().equals(brand)) {
                    print(currentCar);
                }
            }
        }

        public static void filterCar(String model, int cntYear) {
            for (Car currentCar : listCar) {
                if (currentCar.getModel().equals(model) && (getCurrentYear() - currentCar.getYear()) > cntYear) {
                    print(currentCar);
                }
            }
        }

        public static void filterCar(int year, double price) {
            for (Car currentCar : listCar) {
                if (currentCar.getYear() == year && currentCar.getCost() > price) {
                    print(currentCar);
                }
            }
        }
    public static void addCar(Car currentCar) {
        listCar.add(currentCar);
    }

    private static void print(Car currentCar) {
        System.out.println(currentCar);

    }

    @Override
public String toString() {
    final StringBuilder sb = new StringBuilder("Car{");
    sb.append("brand='").append(brand).append('\'');
    sb.append(", model='").append(model).append('\'');
    sb.append(", year=").append(year);
    sb.append(", color='").append(color).append('\'');
    sb.append(", cost=").append(cost);
    sb.append(", registration_of_number='").append(registration_of_number).append('\'');
    sb.append('}');
    return sb.toString();
}

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return (double) cost / 100;
    }

    public void setCost(double cost) {
        this.cost = (long) (cost * 100);
    }

    public void setRegistrationNo(String registration_of_number) {
        this.registration_of_number = registration_of_number;
    }
}



























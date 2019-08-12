
public class Car_Main_Java_Clases {

    public static void main(String[] args) {

        Car.addCar(new Car("audi", "A6", 2006, "WHITE", 12500.50, "G 125S F"));
        Car.addCar(new Car("audi", "A8", 2008, "RED", 15300., "K 183L G"));
        Car.addCar(new Car("bmw", "3", 2006, "YELLOW", 14000., "H 444J K"));
        Car.addCar(new Car("bmw", "3", 2005, "YELLOW", 14000., "H 444J K"));
        Car.addCar(new Car("bmw", "7", 2002, "BLACK", 10400., "Y Y15R Q"));
        Car.addCar(new Car("VW", "Polo", 2009, "GRAY", 11500., "F 189N C"));

        System.out.println("Список автомобилей заданной марки");
        Car.filterCar("audi");
        System.out.println("Список автомобилей заданной модели, которые эксплуатируются больше n лет");
        Car.filterCar("3", 5);
        System.out.println("Список автомобилей заданного года выпуска, цена которых больше указанной");
        Car.filterCar(2006, 10000.00);
    }
}

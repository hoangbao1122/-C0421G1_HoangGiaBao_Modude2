package _05_access_modifier_static_method_static_property.thuchanh.car;

public class Car {
    private String name;
    private String enegine;

    public static int numberOfCar;

    public Car(String name,String enegine){
        this.name = name;
        this.enegine = enegine;
        numberOfCar++;
    }

    public String getName() {
        return name;
    }

    public String getEnegine() {
        return enegine;
    }

    public static int getNumberOfCar() {
        return numberOfCar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnegine(String enegine) {
        this.enegine = enegine;
    }

    public static void setNumberOfCar(int numberOfCar) {
        Car.numberOfCar = numberOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", enegine='" + enegine + '\'' +
                ", numberCar= '" + getNumberOfCar() + '\'' +
                '}';
    }
}

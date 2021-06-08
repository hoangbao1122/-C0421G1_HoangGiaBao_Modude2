package _05_access_modifier_static_method_static_property.thuchanh.car;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("lambogini","Sky");
        System.out.println(car.toString());
        Car car2 = new Car("Mec","hi");
        System.out.println(car2.toString());
    }
}

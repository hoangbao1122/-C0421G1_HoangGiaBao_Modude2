package case_study.model.Furama;

import case_study.model.abtract.Facility;

public class Room extends Facility {
    private String serviceFree;//dịch vụ miễn phí
    public Room(){

    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String name, int area, int moneyRend, int maxPeople, String rentalType, String serviceFree) {
        super(name, area, moneyRend, maxPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceFree='" + serviceFree + '\'' +
                super.toString() +
                '}';
    }
}

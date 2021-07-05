package case_study.model.Furama;

import case_study.model.abtract.Facility;

public class Villa extends Facility {
    private String roomStandard; // tiêu chuản phòng;
    private int arePool;
    private int numberOfFloor; // số tầng

    public Villa() {

    }

    public Villa(String roomStandard, int arePool, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.arePool = arePool;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String name, int area, int moneyRend, int maxPeople, String rentalType, String roomStandard, int arePool, int numberOfFloor) {
        super(name, area, moneyRend, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.arePool = arePool;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getArePool() {
        return arePool;
    }

    public void setArePool(int arePool) {
        this.arePool = arePool;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard=" + roomStandard +
                ", arePool=" + arePool +
                ", numberOfFloor=" + numberOfFloor +
                super.toString() +
                '}';
    }
}

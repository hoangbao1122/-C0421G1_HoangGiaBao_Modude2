package case_study.model.Furama;

import case_study.model.abtract.Facility;

public class House extends Facility {
    private int roomStandard;
    private int NumberOfFlorr;

   public House(){

   }

    public House(int roomStandard, int numberOfFlorr) {
        this.roomStandard = roomStandard;
        NumberOfFlorr = numberOfFlorr;
    }

    public House(String name, int area, int moneyRend, int maxPeople, String rentalType, int roomStandard, int numberOfFlorr) {
        super(name, area, moneyRend, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        NumberOfFlorr = numberOfFlorr;
    }

    public int getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(int roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFlorr() {
        return NumberOfFlorr;
    }

    public void setNumberOfFlorr(int numberOfFlorr) {
        NumberOfFlorr = numberOfFlorr;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard=" + roomStandard +
                ", NumberOfFlorr=" + NumberOfFlorr +
                '}';
    }
}

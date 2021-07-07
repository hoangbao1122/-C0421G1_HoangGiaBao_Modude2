package case_study.model.abtract;

import TestSuongSuong.Villa;

import java.io.Serializable;

public abstract class Facility implements Serializable {
    private String name;
    private int area;
    private int MoneyRend; // chi phí thuê
    private int maxPeople;
    private String rentalType; // kiểu thuê

    public Facility(){

    }

    public Facility(String name, int area, int moneyRend, int maxPeople, String rentalType) {
        this.name = name;
        this.area = area;
        MoneyRend = moneyRend;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getMoneyRend() {
        return MoneyRend;
    }

    public void setMoneyRend(int moneyRend) {
        MoneyRend = moneyRend;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +

                ", name='" + name + '\'' +
                ", area=" + area +
                ", MoneyRend=" + MoneyRend +
                ", maxPeople=" + maxPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}

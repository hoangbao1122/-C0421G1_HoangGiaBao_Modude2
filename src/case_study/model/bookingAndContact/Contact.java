package case_study.model.bookingAndContact;

import java.io.Serializable;

public class Contact implements Serializable {
    private int idContact;
    private int idBooking;
    private double moneyTraTruoc;
    private double totalMoney;
    private int idCustomer;

    public Contact(){

    }
    public Contact(int idContact, int idBooking, double moneyTraTruoc, double totalMoney, int idCustomer) {
        this.idContact = idContact;
        this.idBooking = idBooking;
        this.moneyTraTruoc = moneyTraTruoc;
        this.totalMoney = totalMoney;
        this.idCustomer = idCustomer;
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getMoneyTraTruoc() {
        return moneyTraTruoc;
    }

    public void setMoneyTraTruoc(double moneyTraTruoc) {
        this.moneyTraTruoc = moneyTraTruoc;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "idContact=" + idContact +
                ", idBooking=" + idBooking +
                ", moneyTraTruoc=" + moneyTraTruoc +
                ", totalMoney=" + totalMoney +
                ", idCustomer=" + idCustomer +
                '}';
    }
}

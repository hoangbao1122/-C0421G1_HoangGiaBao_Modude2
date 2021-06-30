package _17_IO_binary_file_serialization.baitap;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private String Manufactuner;
    private double moneyProduct;
    private String other;

    public Product() {

    }

    public Product(int idProduct, String nameProduct, String manufactuner, double moneyProduct, String other) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        Manufactuner = manufactuner;
        this.moneyProduct = moneyProduct;
        this.other = other;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufactuner() {
        return Manufactuner;
    }

    public void setManufactuner(String manufactuner) {
        Manufactuner = manufactuner;
    }

    public double getMoneyProduct() {
        return moneyProduct;
    }

    public void setMoneyProduct(double moneyProduct) {
        this.moneyProduct = moneyProduct;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", Manufactuner='" + Manufactuner + '\'' +
                ", moneyProduct=" + moneyProduct +
                ", other='" + other + '\'' +
                '}';
    }
}

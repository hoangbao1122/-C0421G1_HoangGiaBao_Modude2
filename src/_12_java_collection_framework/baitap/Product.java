package _12_java_collection_framework.baitap;

public class Product implements Comparable<Product> {
    private int id;
    private String product;
    private double money;

    public Product() {

    }

    public Product(int id, String product, double money) {
        this.id = id;
        this.product = product;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.money > o.getMoney()){
            return 1;
        }else if (this.money<o.getMoney()){
            return -1;
        }else {
            return 0;
        }
    }
}

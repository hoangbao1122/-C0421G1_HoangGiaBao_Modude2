package case_study.model.people;

import case_study.model.abtract.Person;

public class Customer extends Person {
    private String loaiKhach;
    private String address;

    public Customer() {
    }

    public Customer(String loaiKhach, String address) {
        this.loaiKhach = loaiKhach;
        this.address = address;
    }

    public Customer(int id, String name, String birthday, String gender, double CMND, int number, String email, String address, String loaiKhach, String address1) {
        super(id, name, birthday, gender, CMND, number, email, address);
        this.loaiKhach = loaiKhach;
        this.address = address1;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "loaiKhach='" + loaiKhach + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

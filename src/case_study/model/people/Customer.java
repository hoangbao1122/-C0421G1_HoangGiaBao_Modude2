package case_study.model.people;

import case_study.model.abtract.Person;

import java.io.Serializable;

public class Customer extends Person implements Serializable {
    private String loaiKhach;


    public Customer() {
    }

    public Customer(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public Customer(int id, String name, String birthday, String gender, String CMND, String number, String email, String address, String loaiKhach) {
        super(id, name, birthday, gender, CMND, number, email, address);
        this.loaiKhach = loaiKhach;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "loaiKhach='" + loaiKhach + '\'' +
                super.toString() +
                '}';
    }
}

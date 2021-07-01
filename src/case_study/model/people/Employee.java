package case_study.model.people;

import case_study.model.abtract.Person;

public class Employee extends Person {
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee(){

    }

    public Employee(String trinhDo, String viTri, double luong) {
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(int id, String name, String birthday, String gender, double CMND, int number, String email, String address, String trinhDo, String viTri, double luong) {
        super(id, name, birthday, gender, CMND, number, email, address);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
}

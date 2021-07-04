package case_study.model.people;

import case_study.model.abtract.Person;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private String trinhDo;
    private String viTri;
    private double luong;
    public Employee(int id, String name, String bithday, String gender, String cmnd, String number, String email, String address, String loaiKhach){

    }
    public Employee(int inputId, String inputName, String inputBirthday, String inputGender, double inputCmnd, double inputNumber, String inputAddress, String trinhDo, String vitri, double luong) {

    }

    public Employee(String trinhDo, String viTri, double luong) {
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(int id, String name, String birthday, String gender, String CMND, String number, String email, String address, String trinhDo, String viTri, double luong) {
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

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + this.getId() +
//                ", name='" + this.getName() + '\'' +
//                ", birthday='" + this.getBirthday() + '\'' +
//                ", gender='" + this.getGender() + '\'' +
//                ", CMND=" + this.getCMND() +
//                ", number=" + this.getNumber() +
//                ", email='" + this.getEmail() + '\'' +
//                ", address='" + this.getAddress() + '\'' +
//                ",trinhDo='" + trinhDo + '\'' +
//                ", viTri='" + viTri + '\'' +
//                ", luong=" + luong +
//
//                '}';
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                super.toString() +
                '}';
    }
}


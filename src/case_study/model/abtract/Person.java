package case_study.model.abtract;

public abstract class Person {
    private int id;
    private String name;
    private String birthday;
    private String gender;
    private double CMND;
    private int number;
    private String email;
    private String address;

    public Person(){

    }
    public Person(int id, String name, String birthday, String gender, double CMND, int number, String email, String address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.CMND = CMND;
        this.number = number;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getCMND() {
        return CMND;
    }

    public void setCMND(double CMND) {
        this.CMND = CMND;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", CMND=" + CMND +
                ", number=" + number +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

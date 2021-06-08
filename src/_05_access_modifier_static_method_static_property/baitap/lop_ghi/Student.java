package _05_access_modifier_static_method_static_property.baitap.lop_ghi;

public class Student {
    private String name = "bao";
    private String classer = "C02";

    public Student() {

    }
    public String getName() {
        return this.name;
    }
    public String getClasser() {
        return this.classer;
    }
    public   void setName(String newName) {
        this.name = newName;
    }
    public void setClasser(String newClasser) {
        this.classer = newClasser;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classer='" + classer + '\'' +
                '}';
    }
}

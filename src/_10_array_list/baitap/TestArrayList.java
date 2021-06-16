package _10_array_list.baitap;

public class TestArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {

        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
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
    }

    public static void main(String[] args){
        Student a = new Student(1, "bảo");
        Student b = new Student(2, "hoàng");
        Student c = new Student(3,"gia");
        Student d = new Student(4,"hello");
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(a);
        studentArrayList.add(b);
        studentArrayList.add(c);
        studentArrayList.remove(1);
        for (int i = 0; i < studentArrayList.getSize(); i++) {
            Student student = (Student) studentArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
//        System.out.println(studentArrayList.get(0).getName());
//        System.out.println(studentArrayList.indexOf(d));
//        System.out.println(studentArrayList.contains(d));
        System.out.println("");
        ArrayList<Student> newArray = studentArrayList.clone();
        for (int i = 0;i<newArray.getSize();i++){
            System.out.println(newArray.get(i).getName());
        }


    }
}

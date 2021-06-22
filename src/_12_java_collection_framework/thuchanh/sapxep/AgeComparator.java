package _12_java_collection_framework.thuchanh.sapxep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge().equals(o2.getAge())){
            return 0;
        }else{
            return -1;
        }
    }
}

package case_study.serivce;

import case_study.model.people.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements Service {
    private static Scanner scanner;
    private static List<Employee> listEmployee;
    static {
        listEmployee = new ArrayList<>();
        listEmployee.add(new Employee("good","hello",100000));
    }
    @Override
    public void add() {
        System.out.println("nhập vào nhân viên muốn thêm");

    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }
}

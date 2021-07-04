package case_study.serivce;

import _17_IO_binary_file_serialization.thuchanh.DocGhiFileNhiPhan.WriteAndRead;
import case_study.common.WriteAndReadFile;
import case_study.model.people.Employee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceImpl implements Service, Serializable {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> listEmployee = new ArrayList<>();
    private static WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
    private static final String filePath = "src\\case_study\\data\\employee.txt";

    public void readFileEmp() {
        WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
        writeAndReadFile.Read(filePath);
    }

    @Override
    public void add() {
        int inputId = 0;
        if (listEmployee.isEmpty()) {
            inputId = 1;
        } else {
            inputId = listEmployee.get(listEmployee.size() - 1).getId() + 1;
        }


        System.out.println("nhập vào name nhân viên");
        String inputName = scanner.next();


        System.out.println("nhập vào ngày tháng năm sinh");
        String inputBirthday = scanner.next();


        System.out.println("nhập vào giới tính");
        String inputGender = scanner.next();


        System.out.println("nhập vào CMND");
        String inputCmnd = scanner.next();


        System.out.println("nhập vào sdt");
        String inputNumber = scanner.next();


        System.out.println("nhập vào email");
        String inputEmail = scanner.next();

        System.out.println("nhập vào địa chỉ");
        String inputAddress = scanner.next();


        System.out.println("nhập vào trình độ");
        System.out.println("1 = Trung cấp");
        System.out.println("2 = Cao Đẳng");
        System.out.println("3 = Đại học");
        System.out.println("4 = sau Đại học");
        String trinhDo = scanner.next();
        switch (trinhDo) {
            case "1": {
                System.out.println("Trung cấp");
                trinhDo = "Trung cấp";
                break;
            }
            case "2": {
                System.out.println("Cao Đẳng ");
                trinhDo = "Cao Đẳng";
                break;
            }
            case "3": {
                System.out.println("Đại học");
                trinhDo = "Đại học";
                break;
            }
            case "4": {
                System.out.println("sau Đại học");
                trinhDo = "sau Đại học";
                break;
            }
            default: {
                System.out.println("bn nhâp sai");
                break;
            }
        }


        System.out.println("nhập vào vị trí");
        System.out.println("1 = lễ tân");
        System.out.println("2 = phục vụ");
        System.out.println("3 = chuyên viên");
        System.out.println("4 = quản lí");
        System.out.println("5 = giám đốc");
        String vitri = scanner.next();
        switch (vitri) {
            case "1": {
                System.out.println("lễ tân");
                vitri = "lễ tân";
                break;
            }
            case "2": {
                System.out.println("phục vụ");
                vitri = "phục vụ";
                break;
            }
            case "3": {
                System.out.println("chuyên viên");
                vitri = "chuyên viên";
                break;
            }
            case "4": {
                System.out.println("giám sát");
                vitri = "giám sát";
                break;
            }
            case "5": {
                System.out.println("quản lí");
                vitri = "quản lí";
                break;
            }
            case "6": {
                System.out.println("giám đốc");
                vitri = "giám đốc";
                break;
            }
            default: {
                System.out.println("bn nhập sai");
                break;
            }
        }


        System.out.println("nhập vào lương");
        double luong = scanner.nextDouble();


        listEmployee.add(new Employee(inputId, inputName, inputBirthday, inputGender, inputCmnd, inputNumber, inputEmail, inputAddress, trinhDo, vitri, luong));

        writeAndReadFile.Write(filePath, listEmployee);
    }

    @Override
    public void edit() {
        readFileEmp();
        System.out.println("nhập vào id bn muốn sửa");
        int inputIdEdit = scanner.nextInt();
        for (int i = 0; i < listEmployee.size(); i++) {

            if (listEmployee.get(i).getId() == inputIdEdit) {
                System.out.println(listEmployee.get(i));

                listEmployee.get(i).getId();

                System.out.println("nhập vào name nhân viên");
                String inputName = scanner.next();
                listEmployee.get(i).setName(inputName);

                System.out.println("nhập vào ngày tháng năm sinh");
                String inputBirthday = scanner.next();
                listEmployee.get(i).setBirthday(inputBirthday);

                System.out.println("nhập vào giới tính");
                String inputGender = scanner.next();
                listEmployee.get(i).setGender(inputGender);

                System.out.println("nhập vào CMND");
                String inputCmnd = scanner.next();
                listEmployee.get(i).setCMND(inputCmnd);

                System.out.println("nhập vào sdt");
                String inputNumber = scanner.next();
                listEmployee.get(i).setNumber(inputNumber);

                System.out.println("nhập vào email");
                String inputEmail = scanner.next();
                listEmployee.get(i).setEmail(inputEmail);

                System.out.println("nhập vào địa chỉ");
                String inputAddress = scanner.next();
                listEmployee.get(i).setAddress(inputAddress);

                System.out.println("nhập vào trình độ");
                System.out.println("1 = Trung cấp");
                System.out.println("2 = Cao Đẳng");
                System.out.println("3 = Đại học");
                System.out.println("4 = sau Đại học");
                String trinhDo = scanner.next();
                switch (trinhDo) {
                    case "1": {
                        System.out.println("Trung cấp");
                        trinhDo = "Trung cấp";
                        listEmployee.get(i).setTrinhDo(trinhDo);
                        break;
                    }
                    case "2": {
                        System.out.println("Cao Đẳng ");
                        trinhDo = "Cao Đẳng";
                        listEmployee.get(i).setTrinhDo(trinhDo);
                        break;
                    }
                    case "3": {
                        System.out.println("Đại học");
                        trinhDo = "Đại học";
                        listEmployee.get(i).setTrinhDo(trinhDo);
                        break;
                    }
                    case "4": {
                        System.out.println("sau Đại học");
                        trinhDo = "sau Đại học";
                        listEmployee.get(i).setTrinhDo(trinhDo);
                        break;
                    }
                    default: {
                        System.out.println("bn nhâp sai");
                        break;
                    }
                }


                System.out.println("nhập vào vị trí");
                System.out.println("1 = lễ tân");
                System.out.println("2 = phục vụ");
                System.out.println("3 = chuyên viên");
                System.out.println("4 = quản lí");
                System.out.println("5 = giám đốc");
                String vitri = scanner.next();
                switch (vitri) {
                    case "1": {
                        System.out.println("lễ tân");
                        vitri = "lễ tân";
                        listEmployee.get(i).setViTri(vitri);
                        break;
                    }
                    case "2": {
                        System.out.println("phục vụ");
                        vitri = "phục vụ";
                        listEmployee.get(i).setViTri(vitri);
                        break;
                    }
                    case "3": {
                        System.out.println("chuyên viên");
                        vitri = "chuyên viên";
                        listEmployee.get(i).setViTri(vitri);
                        break;
                    }
                    case "4": {
                        System.out.println("giám sát");
                        vitri = "giám sát";
                        listEmployee.get(i).setViTri(vitri);
                        break;
                    }
                    case "5": {
                        System.out.println("quản lí");
                        vitri = "quản lí";
                        listEmployee.get(i).setViTri(vitri);
                        break;
                    }
                    case "6": {
                        System.out.println("giám đốc");
                        vitri = "giám đốc";
                        listEmployee.get(i).setViTri(vitri);
                        break;
                    }
                    default: {
                        System.out.println("bn nhập sai");
                        break;
                    }

                }
                System.out.println("nhập vào lương");
                double luong = scanner.nextDouble();
                listEmployee.get(i).setLuong(luong);

                writeAndReadFile.Write(filePath, listEmployee);
                break;
            }
        }

    }


    @Override
    public void display() {

        listEmployee = writeAndReadFile.Read(filePath);
        for (Employee lists : listEmployee) {
            System.out.println(lists.toString());
        }

    }

    @Override
    public void delete() {

    }


}

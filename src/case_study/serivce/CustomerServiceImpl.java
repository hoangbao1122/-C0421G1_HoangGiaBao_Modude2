package case_study.serivce;

import case_study.common.WriteAndReadFile;
import case_study.model.people.Customer;
import case_study.model.people.Employee;

import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements Service {
    private Scanner scanner = new Scanner(System.in);
    private static List<Customer> linkedList = new LinkedList<>();
    private static WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
    private static final String filePath = "src\\case_study\\data\\customer.txt";


    public void readFile() {
        writeAndReadFile.Read(filePath);
    }

    @Override
    public void add() {
        int id = 0;
        if (linkedList.isEmpty()) {
            id = 1;
        } else {
            id = linkedList.get(linkedList.size() - 1).getId() + 1;
        }

        System.out.println("nhập vào name nhân viên");
        String name = scanner.next();


        System.out.println("nhập vào ngày tháng năm sinh");
        String bithday = scanner.next();


        System.out.println("nhập vào giới tính");
        String gender = scanner.next();


        System.out.println("nhập vào CMND");
        String cmnd = scanner.next();


        System.out.println("nhập vào sdt");
        String number = scanner.next();


        System.out.println("nhập vào email");
        String email = scanner.next();

        System.out.println("nhập vào địa chỉ");
        String address = scanner.next();

        System.out.println("loại khác");
        System.out.println("1 = Diamond");
        System.out.println("2 = Platinium");
        System.out.println("3 = Gold");
        System.out.println("4 = Silver ");
        System.out.println("5 = Member");
        String loaiKhach = scanner.next();


            switch (loaiKhach) {
                case "1": {
                    System.out.println("Diamond");
                    loaiKhach = "Diamond";

                    break;
                }
                case "2": {
                    System.out.println("Platinium,");
                    loaiKhach = "Platinium";

                    break;
                }
                case "3": {
                    System.out.println("Gold");
                    loaiKhach = "Gold";
                    break;
                }
                case "4": {
                    System.out.println("Silver");
                    loaiKhach = "Silver";
                    break;
                }
                case "5": {
                    System.out.println("Member");
                    loaiKhach = "Member";
                    break;
                }
                default: {
                    System.out.println("bạn chọn sai");
                    break;
                }
            }


        linkedList.add(new Customer(id, name, bithday, gender, cmnd, number, email, address, loaiKhach));
        writeAndReadFile.Write(filePath, linkedList);


    }

    @Override
    public void edit() {
        readFile();
        System.out.println("nhập vào id muốn sửa");
        int idEdit = scanner.nextInt();
        for (int i = 0;i<linkedList.size();i++){
            if (linkedList.get(i).getId() == idEdit) {
                System.out.println(linkedList.get(i));
                linkedList.get(i).getId();


                System.out.println("nhập vào name nhân viên");
                String name = scanner.next();
                linkedList.get(i).setName(name);

                System.out.println("nhập vào ngày tháng năm sinh");
                String bithday = scanner.next();
                linkedList.get(i).setBirthday(bithday);

                System.out.println("nhập vào giới tính");
                String gender = scanner.next();
                linkedList.get(i).setGender(gender);

                System.out.println("nhập vào CMND");
                String cmnd = scanner.next();
                linkedList.get(i).setCMND(cmnd);

                System.out.println("nhập vào sdt");
                String number = scanner.next();
                linkedList.get(i).setCMND(number);

                System.out.println("nhập vào email");
                String email = scanner.next();
                linkedList.get(i).setEmail(email);

                System.out.println("nhập vào địa chỉ");
                String address = scanner.next();
                linkedList.get(i).setAddress(address);

                System.out.println("loại khác");
                System.out.println("1 = Diamond");
                System.out.println("2 = Platinium");
                System.out.println("3 = Gold");
                System.out.println("4 = Silver ");
                System.out.println("5 = Member");
                String loaiKhach = scanner.next();


                switch (loaiKhach) {
                    case "1": {
                        System.out.println("Diamond");
                        loaiKhach = "Diamond";
                        linkedList.get(i).setLoaiKhach(loaiKhach);
                        break;
                    }
                    case "2": {
                        System.out.println("Platinium,");
                        loaiKhach = "Platinium";
                        linkedList.get(i).setLoaiKhach(loaiKhach);
                        break;
                    }
                    case "3": {
                        System.out.println("Gold");
                        loaiKhach = "Gold";
                        linkedList.get(i).setLoaiKhach(loaiKhach);
                        break;
                    }
                    case "4": {
                        System.out.println("Silver");
                        loaiKhach = "Silver";
                        linkedList.get(i).setLoaiKhach(loaiKhach);
                        break;
                    }
                    case "5": {
                        System.out.println("Member");
                        loaiKhach = "Member";
                        linkedList.get(i).setLoaiKhach(loaiKhach);
                        break;
                    }
                    default: {
                        System.out.println("bạn chọn sai");
                        break;
                    }
                }
                writeAndReadFile.Write(filePath,linkedList);
                System.out.println("cập nhập thành công");
            }

        }
    }

    @Override
    public void display() {
        linkedList = writeAndReadFile.Read(filePath);
        for (Customer customer : linkedList) {
            System.out.println(customer.toString());
        }

    }

    @Override
    public void delete() {

    }
}

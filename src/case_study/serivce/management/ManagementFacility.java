package case_study.serivce.management;

import _17_IO_binary_file_serialization.thuchanh.DocGhiFileNhiPhan.WriteAndRead;
import case_study.common.WriteAndReadFacility;
import case_study.model.Furama.House;
import case_study.model.Furama.Room;
import case_study.model.Furama.Villa;
import case_study.model.abtract.Facility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ManagementFacility {
//    private static WriteAndReadFacility writeAndRead = new WriteAndReadFacility();
//    private static Scanner scanner = new Scanner(System.in);
//    private static final String filePathVilla = "src\\case_study\\data\\villa.txt";
//    private static final String filePathHouse = "src\\case_study\\data\\house.txt";
//    private static final String filePathRoom = "src\\case_study\\data\\room.txt";
//    public static Map<Facility,Integer> villa = new LinkedHashMap<>();
//    public static Map<Facility, Integer> house = new LinkedHashMap<>();
//    public static Map<Facility,Integer> room = new LinkedHashMap<>();
//    public static void addVilla() {
//
//        System.out.println("nhập vào name ");
//        String name = scanner.next();
//
//        System.out.println("nhập vào diện tích");
//        int area = scanner.nextInt();
//
//        System.out.println("nhập vào số tiền");
//        int moneyRend = scanner.nextInt();
//
//        System.out.println("nhập vào số lượng người ở");
//        int maxPeople = scanner.nextInt();
//
//        System.out.println("nhập vào loại cho thuê");
//        String rentalType = scanner.next();
//
//        System.out.println("nhập vào phòng tiêu chuẩn");
//        String roomStandard = scanner.next();
//
//        System.out.println("nhập vào diện tích hồ bơi");
//        int arePool = scanner.nextInt();
//
//        System.out.println("nhập vào số tầng");
//        int numberOfFloor = scanner.nextInt();
//
//        villa.put(new Villa(name, area, moneyRend, maxPeople, rentalType, roomStandard, arePool, numberOfFloor), 1);
//        writeAndRead.Write(filePathVilla, villa);
//    }
//
//    public static void addHouse() {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập vào name ");
//        String name = scanner.next();
//
//        System.out.println("nhập vào diện tích");
//        int area = scanner.nextInt();
//
//        System.out.println("nhập vào số tiền");
//        int moneyRend = scanner.nextInt();
//
//        System.out.println("nhập vào số lượng người ở");
//        int maxPeople = scanner.nextInt();
//
//        System.out.println("nhập vào loại cho thuê");
//        String rentalType = scanner.next();
//
//        System.out.println("nhập vào phòng tiêu chuẩn");
//        String roomStandard = scanner.next();
//
//        System.out.println("nhập vào số tầng");
//        int numberOfFloor = scanner.nextInt();
//
//        house.put(new House(name, area, moneyRend, maxPeople, rentalType, roomStandard, numberOfFloor), 1);
//        writeAndRead.Write(filePathHouse, house);
//    }
//
//    public static void addRoom() {
//
//        System.out.println("nhập vào name ");
//        String name = scanner.next();
//
//        System.out.println("nhập vào diện tích");
//        int area = scanner.nextInt();
//
//        System.out.println("nhập vào số tiền");
//        int moneyRend = scanner.nextInt();
//
//        System.out.println("nhập vào số lượng người ở");
//        int maxPeople = scanner.nextInt();
//
//        System.out.println("nhập vào loại cho thuê");
//        String rentalType = scanner.next();
//
//        System.out.println("nhập vào phòng tiêu chuẩn");
//        String serviceFree = scanner.next();
//
//
//        room.put(new Room(name, area, moneyRend, maxPeople, rentalType, serviceFree), 1);
//        writeAndRead.Write(filePathRoom, room);
//    }


}

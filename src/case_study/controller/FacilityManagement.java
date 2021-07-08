package case_study.controller;

import case_study.common.WriteAndReadFacility;
import case_study.model.Furama.House;
import case_study.model.Furama.Room;
import case_study.model.Furama.Villa;
import case_study.model.abtract.Facility;
import case_study.serivce.faciliti.FacilityServiceImpl;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityManagement{
    public static void FacilityManagement(){
        Scanner scanner = new Scanner(System.in);
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        System.out.println("1 = display ");
        System.out.println("2 = add ");
        System.out.println("3 = hiển thị dịch vụ cần bảo trì");
        System.out.println("4 = tro ve ");
        int input = scanner.nextInt();
        switch (input){
            case 1:{
                facilityService.display();
                break;
            }
            case 2:{
                facilityService.add();
                break;
            }
            case 3:{
//                facilityService.maintenanceDisplay();
                break;
            }
            case 4:{
                System.out.println("tra ve cai chon ban dau");
                FuramaController.displayMainMenu();
            }
            default:{
                System.out.println("bn nhap sai");
                break;
            }
        }


    }

    private static WriteAndReadFacility writeAndRead = new WriteAndReadFacility();
    private static Scanner scanner = new Scanner(System.in);
    private static final String filePathVilla = "src\\case_study\\data\\villa.txt";
    private static final String filePathHouse = "src\\case_study\\data\\house.txt";
    private static final String filePathRoom = "src\\case_study\\data\\room.txt";
    private static final String fileFacility = "src\\case_study\\data\\FacilityService.txt";
    public static Map<Facility,Integer> villa = new LinkedHashMap<>();
    public static Map<Facility, Integer> house = new LinkedHashMap<>();
    public static Map<Facility,Integer> room = new LinkedHashMap<>();
    private static Map<Facility,Integer> map = new LinkedHashMap<>();

    public static void addVilla() {

        System.out.println("bạn chọn dịch vụ villa");
        String name = "villa";

        System.out.println("nhập vào diện tích");
        int area = scanner.nextInt();

        System.out.println("nhập vào số tiền");
        int moneyRend = scanner.nextInt();

        System.out.println("nhập vào số lượng người ở");
        int maxPeople = scanner.nextInt();

        System.out.println("nhập vào loại cho thuê");
        String rentalType = scanner.next();

        System.out.println("nhập vào phòng tiêu chuẩn");
        String roomStandard = scanner.next();

        System.out.println("nhập vào diện tích hồ bơi");
        int arePool = scanner.nextInt();

        System.out.println("nhập vào số tầng");
        int numberOfFloor = scanner.nextInt();

        villa.put(new Villa(name, area, moneyRend, maxPeople, rentalType, roomStandard, arePool, numberOfFloor), 1);

        writeAndRead.Write(filePathVilla, villa);
        map.putAll(villa);
        writeAndRead.Write(fileFacility,map);
    }

    public static void addHouse() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn chọn dịch vụ house");
        String name = "house";

        System.out.println("nhập vào diện tích");
        int area = scanner.nextInt();

        System.out.println("nhập vào số tiền");
        int moneyRend = scanner.nextInt();

        System.out.println("nhập vào số lượng người ở");
        int maxPeople = scanner.nextInt();

        System.out.println("nhập vào loại cho thuê");
        String rentalType = scanner.next();

        System.out.println("nhập vào phòng tiêu chuẩn");
        String roomStandard = scanner.next();

        System.out.println("nhập vào số tầng");
        int numberOfFloor = scanner.nextInt();

        house.put(new House(name, area, moneyRend, maxPeople, rentalType, roomStandard, numberOfFloor), 1);
        writeAndRead.Write(filePathHouse, house);
        map.putAll(villa);
        writeAndRead.Write(fileFacility,map);
    }

    public static void addRoom() {

        System.out.println("bạn đã chọn room");
        String name = "room";

        System.out.println("nhập vào diện tích");
        int area = scanner.nextInt();

        System.out.println("nhập vào số tiền");
        int moneyRend = scanner.nextInt();

        System.out.println("nhập vào số lượng người ở");
        int maxPeople = scanner.nextInt();

        System.out.println("nhập vào loại cho thuê");
        String rentalType = scanner.next();

        System.out.println("nhập vào phòng tiêu chuẩn");
        String serviceFree = scanner.next();


        room.put(new Room(name, area, moneyRend, maxPeople, rentalType, serviceFree), 1);
        writeAndRead.Write(filePathRoom, room);
        map.putAll(villa);
        writeAndRead.Write(fileFacility,map);
    }

    public static Map<Facility,Integer>getMap(){
        return map;
    }


}

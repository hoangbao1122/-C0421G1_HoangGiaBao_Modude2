package case_study.serivce;

import case_study.common.WriteAndReadBooking;
import case_study.common.WriteAndReadFacility;
import case_study.controller.FacilityManagement;
import case_study.model.Furama.House;
import case_study.model.Furama.Room;
import case_study.model.Furama.Villa;
import case_study.model.abtract.Facility;
import case_study.serivce.interface_all.FacilityService;
import case_study.serivce.management.ManagementFacility;

import java.util.*;

import static case_study.controller.FacilityManagement.house;
import static case_study.controller.FacilityManagement.room;


public class FacilityServiceImpl implements FacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> villa = new LinkedHashMap<>();

    private static final String filePathVilla = "src\\case_study\\data\\villa.txt";
    private static final String filePathHouse = "src\\case_study\\data\\house.txt";
    private static final String filePathRoom = "src\\case_study\\data\\room.txt";
    private static WriteAndReadFacility writeAndRead = new WriteAndReadFacility();
    private static FacilityManagement facilityManagement = new FacilityManagement();
    static {
        house.put(new House("bao", 20, 20, 10, "bao", "10", 20), 1);
        villa.put(new Villa("bao", 10, 20, 30, "bao", "10", 10, 10), 6);
        room.put(new Room("bao", 20, 10, 10, "bao", "bao"), 3);
    }

    @Override
    public void add() {
        System.out.println("nhập vào dịch vụ muốn chọn");
        System.out.println("choose 1 = Add new Villa");
        System.out.println("choose 2 = Add new House");
        System.out.println("choose 3 = Add new Room");

        String service = scanner.next();
        switch (service) {
            case "1": {
                facilityManagement.addVilla();
                break;
            }
            case "2": {
                facilityManagement.addHouse();
                break;
            }
            case "3": {
                facilityManagement.addRoom();
                break;
            }
            default: {
                System.exit(1);
                break;
            }
        }
//

    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {
        getVilla();
        for (Facility facility : villa.keySet()) {
            System.out.println(facility + " " + villa.get(facility));
        }
        getHouse();
        for (Facility facility : house.keySet()) {
            System.out.println(facility + "" + house.get(facility));

        }
        getRoom();
        for (Facility facility : room.keySet()) {
            System.out.println(facility + " " + room.get(facility));
        }
    }

    @Override
    public Map<Facility, Integer> getVilla() {
        villa = writeAndRead.Read(filePathVilla);
        return villa;
    }

    @Override
    public Map<Facility, Integer> getHouse() {
        house = writeAndRead.Read(filePathHouse);
        return house;
    }

    @Override
    public Map<Facility, Integer> getRoom() {
        room = writeAndRead.Read(filePathRoom);
        return room;
    }

    @Override
    public Map<Facility, Integer> getAll() {
        return null;
    }





//    public static void addVilla() {
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
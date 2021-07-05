package case_study.serivce;

import case_study.common.WriteAndReadBooking;
import case_study.model.Furama.House;
import case_study.model.Furama.Room;
import case_study.model.Furama.Villa;
import case_study.model.abtract.Facility;
import case_study.serivce.interface_all.FacilityService;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility,Integer> map = new LinkedHashMap<>();
    private static final String filePath = "src\\case_study\\data\\villa.txt";
    private static WriteAndReadBooking writeAndRead = new WriteAndReadBooking();
    static {
        map.put(new House("bao",20,20,10,"bao","10",20),1);
        map.put(new Villa("bao",10,20,30,"bao","10",10,10),6);
        map.put(new Room("bao",20,10,10,"bao","bao"),3);
    }
    @Override
    public void add() {
        System.out.println("nhập vào dịch vụ muốn chọn");
        System.out.println("choose 1 = Add new Villa");
        System.out.println("choose 2 = Add new House");
        System.out.println("choose 3 = Add new Room");

        String service = scanner.next();
        switch (service){
            case "1":{
                addVilla();
                break;
            }
            case "2":{
                addHouse();
                break;
            }
            case "3":{
                addRoom();
                break;
            }
            default:{
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
        map = writeAndRead.Read(filePath);
        for (Map.Entry<Facility,Integer> element:map.entrySet()){
            System.out.println(element.getKey().toString() + " số lần sử dụng " + element.getValue());
        }
    }
    @Override
    public void maintenanceDisplay() {
        for (Map.Entry<Facility,Integer> maps : map.entrySet()){
            if (maps.getValue() >= 5){
                System.out.println(maps.getKey() + " cần bảo trì nhé");
            }
        }
    }
    public static void addVilla(){
        System.out.println("nhập vào name ");
        String name = scanner.next();

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

        map.put(new Villa(name,area,moneyRend,maxPeople,rentalType,roomStandard,arePool,numberOfFloor),1);
        writeAndRead.Write(filePath,map);
    }
    public static void addHouse(){
        System.out.println("nhập vào name ");
        String name = scanner.next();

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

        map.put(new House(name,area,moneyRend,maxPeople,rentalType,roomStandard,numberOfFloor),1);
        writeAndRead.Write(filePath,map);
    }
    public static void addRoom(){
        System.out.println("nhập vào name ");
        String name = scanner.next();

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


        map.put(new Room(name,area,moneyRend,maxPeople,rentalType,serviceFree),1);
        writeAndRead.Write(filePath,map);
    }


}

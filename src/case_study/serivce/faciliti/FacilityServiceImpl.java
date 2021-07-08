package case_study.serivce.faciliti;


import case_study.common.WriteAndReadFacility;
import case_study.controller.FacilityManagement;
import case_study.model.Furama.House;
import case_study.model.Furama.Room;
import case_study.model.Furama.Villa;
import case_study.model.abtract.Facility;
import case_study.serivce.interface_all.FacilityService;


import java.util.*;

import static case_study.controller.FacilityManagement.*;


public class FacilityServiceImpl implements FacilityService {
    private static Scanner scanner = new Scanner(System.in);


    private static final String filePathVilla = "src\\case_study\\data\\villa.txt";
    private static final String filePathHouse = "src\\case_study\\data\\house.txt";
    private static final String filePathRoom = "src\\case_study\\data\\room.txt";
//    private static Map<Facility,Integer> map = new LinkedHashMap<>();
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
}
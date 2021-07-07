package case_study.serivce.booking;

import _17_IO_binary_file_serialization.thuchanh.DocGhiFileNhiPhan.WriteAndRead;
import case_study.common.WriteAndReadBooking;

import case_study.common.WriteAndReadFacility;
import case_study.common.WriteAndReadFile;

import case_study.lib.ComparatorBooking;
import case_study.model.abtract.Facility;
import case_study.model.bookingAndContact.Booking;
import case_study.model.people.Customer;
import case_study.serivce.CustomerServiceImpl;

import case_study.serivce.FacilityServiceImpl;
import case_study.serivce.interface_all.BookingService;

import java.util.*;

import static case_study.serivce.CustomerServiceImpl.linkedList;
//import static case_study.serivce.FacilityServiceImpl.map;

public class BookingServiceImpl implements BookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static WriteAndReadBooking writeAndReadBooking = new WriteAndReadBooking();
    private static final String filePath = "src\\case_study\\data\\BookingDangSuLi.txt";
    private static final String filePathCus = "src\\case_study\\data\\customer.txt";
    private static Set<Booking> set = new TreeSet<Booking>(new ComparatorBooking());


    @Override
    public void add() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.display();
        int idCus = 0;
        String serviceName = null;

        int idBooking = 0;
        String startDate = null;
        String endDate = null;
        String serviceType = null;


        idCus = scanner.nextInt();
        for (Customer customer:new CustomerServiceImpl().getAll()){
            if (customer.getId() == idCus){
                idCus = customer.getId();
            }
        }
        idBooking = scanner.nextInt();
        startDate = scanner.nextLine();
        endDate = scanner.nextLine();
        serviceName = scanner.nextLine();
        serviceType = scanner.nextLine();
        set.add(new Booking(idBooking, startDate, endDate, idCus, serviceName, serviceType));
        writeAndReadBooking.Write(filePath,set);

    }
    @Override
    public void edit() {

    }

    @Override
    public void display() {
        writeAndReadBooking.Read(filePath);
        for (Booking booking:set){
            System.out.println(booking);
        }
    }

    @Override
    public void displayListContact() {

    }

    @Override
    public void createContact() {

    }

    @Override
    public void EditContact() {

    }
}

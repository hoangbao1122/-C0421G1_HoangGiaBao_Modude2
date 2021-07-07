package case_study.serivce.booking;
import case_study.common.WriteAndReadBooking;
import case_study.controller.FacilityManagement;
import case_study.lib.ComparatorBooking;
import case_study.model.abtract.Facility;
import case_study.model.bookingAndContact.Booking;
import case_study.model.people.Customer;
import case_study.serivce.CustomerServiceImpl;
import case_study.serivce.interface_all.BookingService;
import java.util.*;




public class BookingServiceImpl implements BookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static WriteAndReadBooking writeAndReadBooking = new WriteAndReadBooking();
    private static final String filePath = "src\\case_study\\data\\BookingDangSuLi.txt";
    private static Collection<Booking> set = new TreeSet<Booking>(new ComparatorBooking());


    @Override
    public void add() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.display();


        System.out.println("nhập id khách hàng");
        int idCus = scanner.nextInt();

        for (Customer customer:new CustomerServiceImpl().getAll()){
            if (customer.getId() == idCus){
                idCus = customer.getId();
            }
        }
        System.out.println("nhập id Booking");
        int idBooking = scanner.nextInt();
        System.out.println("nhập ngày bắt đầu");
        String startDate = scanner.next();
        System.out.println("nhập ngày kết thúc");
        String endDate = scanner.next();
        System.out.println("nhập ten dich vu");
        String serviceName = scanner.next();
        System.out.println("nhập loại dich vu");
        String serviceType = scanner.next();
        set.add(new Booking(idBooking, startDate, endDate, idCus, serviceName, serviceType));
        writeAndReadBooking.Write(filePath,set);

    }
    @Override
    public void edit() {

    }

    @Override
    public void display() {
       set =  writeAndReadBooking.Read(filePath);
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

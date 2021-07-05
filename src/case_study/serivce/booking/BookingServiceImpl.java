//package case_study.serivce.booking;
//
//import case_study.common.WriteAndReadFile;
//import case_study.model.bookingAndContact.Booking;
//import case_study.serivce.interface_all.BookingService;
//import case_study.serivce.interface_all.Service;
//import sun.misc.Queue;
//
//import java.util.*;
//
//public class BookingServiceImpl implements BookingService {
//    private static Scanner scanner = new Scanner(System.in);
//    private static WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
//    private static final String filePath = "src\\case_study\\data\\BookingService.txt";
//    private static Set<Booking> set = new TreeSet<Booking>();
//    @Override
//    public void add() {
//        System.out.println("nhập vào id booking");
//        int idBooking = scanner.nextInt();
//
//        System.out.println("nhập vào ngày kết thúc");
//        String startDate = scanner.next();
//
//        System.out.println("ngày kết thúc");
//        String endDate = scanner.next();
//
//        System.out.println("nhập vào mã khách hàng");
//        int idCustomer = scanner.nextInt();
//
//        System.out.println("nhập vào name dich vu");
//        String nameService = scanner.next();
//
//        System.out.println("loại dịch vụ");
//        String typeSerive = scanner.next();
//
//        set.add(new Booking(idBooking,startDate,endDate,idCustomer,nameService,typeSerive));
//
//    }
//
//    @Override
//    public void edit() {
//
//    }
//
//    @Override
//    public void display() {
//        for (Booking booking:set){
//            System.out.println(booking);
//        }
//    }
//
//    @Override
//    public void displayListContact() {
//
//    }
//
//    @Override
//    public void EditContact() {
//
//    }
//}

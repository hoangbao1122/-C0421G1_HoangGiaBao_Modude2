package case_study.serivce.bookingAndContact;

import case_study.common.WriteAndReadBooking;
import case_study.common.WriteAndReadFile;
import case_study.model.bookingAndContact.Booking;
import case_study.model.bookingAndContact.Contact;
import case_study.model.people.Customer;
import case_study.serivce.interface_all.ContactService;

import java.util.*;

public class ContactServiceImpl implements ContactService {
    private static Queue<Booking> queue = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Set<Booking> set = new TreeSet<>();
    private static WriteAndReadBooking writeAndReadBooking = new WriteAndReadBooking();
    private static ArrayList<Contact> arrayList = new ArrayList<>();
    private static WriteAndReadFile writeAndReadFile = new WriteAndReadFile();

    @Override
    public void add() {
        set = (Set<Booking>) writeAndReadBooking.Read("src\\case_study\\data\\BookingDangSuLi.txt");
        queue.addAll(set);
        while (!queue.isEmpty()) {
            Booking booking = queue.poll();
            System.out.println("nhập id contact");
            int id = scanner.nextInt();
            int idBooking = booking.getIdBooking();
            System.out.println("nhập vào số tiền trả trước");
            double traTruoc = scanner.nextDouble();
            System.out.println("nhập vào tổng tiền");
            double tongTien = scanner.nextDouble();
            int cus = booking.getIdCustomer();
            arrayList.add(new Contact(id, idBooking, traTruoc, tongTien, cus));
        }
        writeAndReadFile.Write("src\\case_study\\data\\contact.txt", arrayList);
    }

    @Override
    public void edit() {
        arrayList = (ArrayList<Contact>) writeAndReadFile.Read("src\\case_study\\data\\contact.txt");
        System.out.println("nhập vào id cần sửa");
        int inputId = scanner.nextInt();
        for (Contact contact : arrayList) {
            if (contact.getIdContact() == (inputId)) {
                System.out.println("nhập vào số tiền trả trước");
                double traTruoc = scanner.nextDouble();
                contact.setMoneyTraTruoc(traTruoc);
                System.out.println("nhập vào tổng tiền");
                double tongTien = scanner.nextDouble();
                contact.setTotalMoney(tongTien);
            }
        }
        writeAndReadFile.Write("src\\case_study\\data\\contact.txt", arrayList);
    }
    @Override
    public void display() {
        arrayList = (ArrayList<Contact>) writeAndReadFile.Read("src\\case_study\\data\\contact.txt");
        for (Contact contact : arrayList) {
            System.out.println(contact);
        }
    }
}

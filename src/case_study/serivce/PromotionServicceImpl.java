package case_study.serivce;

import case_study.model.bookingAndContact.Booking;
import case_study.serivce.bookingAndContact.BookingServiceImpl;
import case_study.serivce.interface_all.PromotionServicce;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PromotionServicceImpl implements PromotionServicce {
    private static Scanner scanner = new Scanner(System.in);
    private static Set<Booking> set = new TreeSet<>();
    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {
    new BookingServiceImpl().display();
    }

    @Override
    public void displayVoucher() {

    }
}

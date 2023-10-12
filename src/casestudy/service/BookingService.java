package casestudy.service;

import casestudy.model.Booking;
import casestudy.model.Contract;
import casestudy.repository.BookingRepository;
import casestudy.repository.CustomerRepository;
import casestudy.repository.FacilityRepository;
import casestudy.utils.BookingCompator;
import casestudy.utils.GetInput;

import java.util.*;

public class BookingService extends GetInput implements IBookingService {
    static BookingRepository bookingRepository = new BookingRepository();
    @Override
    public void add() {
        CustomerService customerService = new CustomerService();
        FacilityService facilityService = new FacilityService();
        customerService.displayList();
        facilityService.displayList();

        System.out.println("Enter ID booking:");
        String idBooking = getIdUser("BK");
        System.out.println("Enter ID customer:");
        String idCustomer = getIdUser("KH");
       if (!CustomerRepository.customerExist(idCustomer)) {
           System.out.println("The ID customer not exist!!!");
           return;
       }
        System.out.println("Enter ID service:");
        String idService = getIdService();
        if (!FacilityRepository.increaseValue(idService)) {
            System.out.println("The ID you entered does not exist!!!");
            return;
        }
        System.out.println("Enter date booking:");
        String date = getDate(false);
        System.out.println("Enter date start:");
        String dateStart = getDate(false);
        System.out.println("Enter date end:");
        String dateEnd = getDate(false);


        Booking booking = new Booking(idBooking, date, dateStart, dateEnd, idCustomer, idService);
        bookingRepository.add(booking);
    }

    @Override
    public void displayList() {
        Set<Booking> list = bookingRepository.getListBooking();
        for (Booking booking : list) {
            System.out.println(booking);
        }
    }

    @Override
    public void createNewContract() {
        Set<Booking> bookings = bookingRepository.getListBooking();
        Queue<Booking> bookingQueue = new ArrayDeque<>(bookings);
        Booking booking = bookingQueue.poll();
        if (booking == null) {
            System.out.println("All bookings have been contracted!!!");
            return;
        }
        String nextId = booking.getBookingCode();
        String idBooking;
        do {
            System.out.println("Enter ID booking: ");
            idBooking = getIdUser("BK");
            if (!idBooking.equals(nextId)) {
                System.out.println("Next booking is : " + nextId);
            }
        } while (!idBooking.equals(nextId));

        System.out.println("Enter ID contract: ");
        String idContract = getIdUser("FM");
        System.out.println("Enter deposit: ");
        double deposit = getExpense();
        System.out.println("Enter total money: ");
        double total = getExpense();

        Contract contract = new Contract(idContract, idBooking, deposit, total);
        bookingRepository.createNewContract(contract);
    }

    @Override
    public void editContract() {
        System.out.println("Enter ID contract: ");
        String idContract = getIdUser("FM");
        bookingRepository.editContract(idContract);
    }

    @Override
    public void displayListContract() {
        List<Contract> list = bookingRepository.getListContract();
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public static boolean checkBooking(Booking bk) {
        List<Contract> list = bookingRepository.getListContract();
        for (Contract contract : list) {
            if (bk.getBookingCode().equals(contract.getBookingCode())) {
                return true;
            }
        }
        return false;
    }
}

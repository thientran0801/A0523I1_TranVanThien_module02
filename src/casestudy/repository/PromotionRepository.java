package casestudy.repository;

import casestudy.model.Booking;
import casestudy.model.Customer;

import java.util.*;

public class PromotionRepository implements IPromotionRepository {
    @Override
    public Set<Customer> getListUseService(int year) {
        CustomerRepository customerRepository = new CustomerRepository();
        BookingRepository bookingRepository = new BookingRepository();

        List<Customer> customerList = customerRepository.getList();
        Set<Customer> customersUseService = new LinkedHashSet<>();
        Set<Booking> list = bookingRepository.getListBooking();

        for (Booking booking :list) {
            if (Integer.parseInt(booking.getBookingdate().substring(6)) != year) {
                continue;
            }
            for (Customer customer :customerList) {
                if (booking.getIdCustomer().equals(customer.getId())) {
                    customersUseService.add(customer);
                }
            }
        }
        return customersUseService;
    }

    @Override
    public TreeSet<Customer> getListGetVoucher() {
        return null;
    }
}

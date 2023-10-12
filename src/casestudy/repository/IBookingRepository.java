package casestudy.repository;

import casestudy.model.Booking;
import casestudy.model.Contract;

import java.util.List;
import java.util.Set;
public interface IBookingRepository{
    void add(Booking booking);
    Set<Booking> getListBooking();
    void createNewContract(Contract contract);
    void editContract(String contractCode);
    List<Contract> getListContract();
}

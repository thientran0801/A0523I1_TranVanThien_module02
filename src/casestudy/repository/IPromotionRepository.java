package casestudy.repository;

import casestudy.model.Booking;
import casestudy.model.Customer;

import java.util.Set;
import java.util.TreeSet;

public interface IPromotionRepository {
    Set<Customer> getListUseService(int year);
    TreeSet<Customer> getListGetVoucher();
}

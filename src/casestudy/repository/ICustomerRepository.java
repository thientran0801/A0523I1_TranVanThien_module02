package casestudy.repository;

import casestudy.model.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer> {
    void edit(List<Customer> list);
}

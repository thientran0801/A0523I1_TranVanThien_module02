package CaseStudy2.repository;

import CaseStudy2.model.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer> {
    void edit(List<Customer> list);
}

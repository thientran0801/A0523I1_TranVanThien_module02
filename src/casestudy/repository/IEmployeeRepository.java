package casestudy.repository;

import casestudy.model.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {
    void edit(List<Employee> list);
}

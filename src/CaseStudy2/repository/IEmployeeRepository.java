package CaseStudy2.repository;

import CaseStudy2.model.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {
    void edit(List<Employee> list);
}

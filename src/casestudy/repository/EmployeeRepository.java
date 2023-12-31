package casestudy.repository;

import casestudy.model.Employee;
import casestudy.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String PATH_EMPLOYEE = "D:\\codegym\\module02\\src\\casestudy\\data\\employee.csv";

    @Override
    public void add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoToWrite());
        ReadAndWrite.writeToFile(PATH_EMPLOYEE, stringList, true);
    }

    @Override
    public List<Employee> getList(){
        List<Employee> employeeArrayList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFromFile(PATH_EMPLOYEE);
        for (String string : stringList) {
            String[] array = string.split(",");
            Employee employee = new Employee(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8], Double.parseDouble(array[9]));
            employeeArrayList.add(employee);
        }
        return employeeArrayList;
    }

    @Override
    public void edit(List<Employee> list) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : list) {
            stringList.add(employee.getInfoToWrite());
        }
        ReadAndWrite.writeToFile(PATH_EMPLOYEE, stringList, false);
    }
}
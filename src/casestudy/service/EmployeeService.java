package casestudy.service;

import casestudy.model.Employee;
import casestudy.repository.EmployeeRepository;
import casestudy.repository.IEmployeeRepository;
import casestudy.utils.GetInfoPerson;

import java.util.List;
import java.util.Scanner;

public class EmployeeService extends GetInfoPerson implements IEmployeeService {
    private final IEmployeeRepository employeeRepository = new EmployeeRepository();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        System.out.println("Enter the ID of the employee you want to update: ");
        String idUpdate = getIdEmployee();
        List<Employee> employeeList = employeeRepository.getList();

        boolean flag = false;
        for (Employee employee : employeeList) {
            if (employee.getId().equals(idUpdate)) {
                System.out.println("Enter new ID employee: ");
                employee.setId(getIdEmployee());
                System.out.println("Enter new name employee: ");
                employee.setName(getNameUser());
                System.out.println("Enter new date of birth employee: ");
                employee.setDob(getDob());
                System.out.println("Enter new gender employee: ");
                employee.setGender(scanner.nextLine());
                System.out.println("Enter new idCard employee: ");
                employee.setIdCard(getIdcard());
                System.out.println("Enter new phone number employee: ");
                employee.setPhoneNumber(getPhoneNumber());
                System.out.println("Enter new email employee: ");
                employee.setEmail(scanner.nextLine());
                System.out.println("Enter new level employee: Trung cấp, Cao đẳng, Đại học and Sau đại học");
                employee.setLevel(scanner.nextLine());
                System.out.println("Enter new position employee: lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc");
                employee.setPosition(scanner.nextLine());
                System.out.println("Enter new salary employee: ");
                employee.setSalary(getSalary());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("ID not found!!!");
            return;
        }
        employeeRepository.edit(employeeList);
    }

    @Override
    public void add() {
        System.out.println("Enter id employee: ");
        String id = getIdEmployee();
        System.out.println("Enter name employee: ");
        String name = getNameUser();
        System.out.println("Enter date of birth employee: ");
        String dob = getDob();
        System.out.println("Enter gender employee: ");
        String gender = scanner.nextLine();
        System.out.println("Enter idCard employee: ");
        String idCard = getIdcard();
        System.out.println("Enter phone number employee: ");
        String phoneNumber = getPhoneNumber();
        System.out.println("Enter email employee: ");
        String email = scanner.nextLine();
        System.out.println("Enter level employee: Trung cấp, Cao đẳng, Đại học and Sau đại học");
        String level = scanner.nextLine();
        System.out.println("Enter position employee: lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc");
        String position = scanner.nextLine();
        System.out.println("Enter salary employee: ");
        int salary = getSalary();
        Employee employee = new Employee(id, name, dob, gender, idCard, phoneNumber, email, level, position, salary);
        employeeRepository.add(employee);
    }

    @Override
    public void displayList() {
        List<Employee> list = employeeRepository.getList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
        }
    }

    public static int getSalary() {
        int salary = 0;
        boolean correct = false;
        do {
            try {
                salary = Integer.parseInt(scanner.nextLine());
                if (salary > 0) {
                    correct = true;
                } else {
                    System.out.println("Salary must be greater than 0");
                    correct = false;
                }
            } catch (Exception e) {
                System.out.println("Error! Please re-enter: " + e.getMessage());
                correct = false;
            }
        } while (!correct);
        return salary;
    }
}

package casestudy.service;

import casestudy.model.Employee;
import casestudy.repository.EmployeeRepository;
import casestudy.repository.IEmployeeRepository;
import casestudy.utils.GetInput;

import java.util.List;
import java.util.Scanner;

public class EmployeeService extends GetInput implements IEmployeeService {
    private final IEmployeeRepository employeeRepository = new EmployeeRepository();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        List<Employee> employeeList = employeeRepository.getList();
        System.out.println("Enter the ID of the employee you want to update: ");
        String idUpdate = getIdUser("NV");

        for (Employee employee : employeeList) {
            if (employee.getId().equals(idUpdate)) {
                System.out.println("Enter new ID employee: ");
                employee.setId(getIdUser("NV"));
                System.out.println("Enter new name employee: ");
                employee.setName(getNameUser());
                System.out.println("Enter new date of birth employee: ");
                employee.setDob(getDate(true));
                System.out.println("Enter new gender employee: ");
                employee.setGender(getText());
                System.out.println("Enter new idCard employee: ");
                employee.setIdCard(getIdcard());
                System.out.println("Enter new phone number employee: ");
                employee.setPhoneNumber(getPhoneNumber());
                System.out.println("Enter new email employee: ");
                employee.setEmail(scanner.nextLine());
                System.out.println("Enter new level employee: Trung cấp, Cao đẳng, Đại học and Sau đại học");
                employee.setLevel(getText());
                System.out.println("Enter new position employee: lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc");
                employee.setPosition(getText());
                System.out.println("Enter new salary employee: ");
                employee.setSalary(getExpense());

                employeeRepository.edit(employeeList);
                return;
            }
        }
        System.out.println("ID not found!!!");
    }

    @Override
    public void add() {
        System.out.println("Enter id employee: ");
        String id = getIdUser("NV");
        System.out.println("Enter name employee: ");
        String name = getNameUser();
        System.out.println("Enter date of birth employee: ");
        String dob = getDate(true);
        System.out.println("Enter gender employee: ");
        String gender = getText();
        System.out.println("Enter idCard employee: ");
        String idCard = getIdcard();
        System.out.println("Enter phone number employee: ");
        String phoneNumber = getPhoneNumber();
        System.out.println("Enter email employee: ");
        String email = scanner.nextLine();
        System.out.println("Enter level employee: Trung cấp, Cao đẳng, Đại học and Sau đại học");
        String level = getText();
        System.out.println("Enter position employee: lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc");
        String position = getText();
        System.out.println("Enter salary employee: ");
        double salary = getExpense();
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
}

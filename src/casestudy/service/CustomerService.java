package casestudy.service;

import casestudy.model.Customer;
import casestudy.repository.CustomerRepository;
import casestudy.utils.GetInput;

import java.util.List;
import java.util.Scanner;

public class CustomerService extends GetInput implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        System.out.println("Enter the customer ID you want to edit:");
        String idEdit = getIdUser("KH");
        List<Customer> customerLists = customerRepository.getList();
        for (Customer customer : customerLists) {
            if (customer.getId().equals(idEdit)) {
                System.out.println("Enter new ID customer: ");
                customer.setId(getIdUser("KH"));
                System.out.println("Enter new name customer: ");
                customer.setName(getNameUser());
                System.out.println("Enter new date of birth customer: ");
                customer.setDob(getDate(true));
                System.out.println("Enter new gender customer: ");
                customer.setGender(getText());
                System.out.println("Enter new idCard customer: ");
                customer.setIdCard(getIdcard());
                System.out.println("Enter new phone number customer: ");
                customer.setPhoneNumber(getPhoneNumber());
                System.out.println("Enter new email customer: ");
                customer.setEmail(scanner.nextLine());
                System.out.println("Enter new customer type: (Diamond, Platinum, Gold, Silver, Member).");
                customer.setCustomerType(getText());
                System.out.println("Enter new address customer: ");
                customer.setAddress(getNameUser());

                customerRepository.edit(customerLists);
                return;
            }
        }
        System.out.println("ID not found!!!");

    }

    @Override
    public void add() {
        System.out.println("Enter id customer: ");
        String id = getIdUser("KH");
        System.out.println("Enter name customer: ");
        String name = getNameUser();
        System.out.println("Enter date of birth customer: ");
        String dob = getDate(true);
        System.out.println("Enter gender customer: ");
        String gender = getText();
        System.out.println("Enter idCard customer: ");
        String idCard = getIdcard();
        System.out.println("Enter phone number customer: ");
        String phoneNumber = getPhoneNumber();
        System.out.println("Enter email customer: ");
        String email = scanner.nextLine();
        System.out.println("Enter customer type customer: (Diamond, Platinum, Gold, Silver, Member).");
        String customerType = getText();
        System.out.println("Enter address customer: ");
        String address = getText();
        Customer customer = new Customer(id, name, dob, gender, idCard, phoneNumber, email, customerType, address);
        customerRepository.add(customer);
    }

    @Override
    public void displayList() {
        List<Customer> list = customerRepository.getList();
        for (int i = 0; i < list.size(); i++) {
            System.out.println((1 + i) + ". " + list.get(i));
        }
    }
}

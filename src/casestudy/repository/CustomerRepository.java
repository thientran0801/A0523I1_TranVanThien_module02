package casestudy.repository;

import casestudy.model.Customer;
import casestudy.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String PATH_CUSTOMER = "D:\\codegym\\module02\\src\\casestudy\\data\\customer.csv";
    private static List<Customer> list = new ArrayList<>();
    static {
        List<String> stringList = new ArrayList<>();
        stringList = ReadAndWrite.readFromFile(PATH_CUSTOMER);
        for (String string : stringList) {
            String[] array = string.split(",");
            Customer customer = new Customer(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
            list.add(customer);
        }
    }
    public static boolean customerExist(String idCheck) {
        for (Customer customer :list) {
            if (customer.getId().equals(idCheck)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public List<Customer> getList() {
        return list;
    }

    @Override
    public void edit(List<Customer> listEdited) {
        list = listEdited;
        update();
    }

    @Override
    public void add(Customer customer) {
        list.add(customer);
        update();
    }

    private void update() {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : list) {
            stringList.add(customer.getInfoToWrite());
        }
        ReadAndWrite.writeToFile(PATH_CUSTOMER, stringList, false);
    }
}

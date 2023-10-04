package CaseStudy2.repository;

import CaseStudy2.model.Customer;
import CaseStudy2.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    private final String PATH_CUSTOMER = "D:\\codegym\\module02\\src\\CaseStudy2\\data\\customer.csv";
    @Override
    public void edit(List<Customer> list) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer :list) {
            stringList.add(customer.getInfoToWrite());
        }
        ReadAndWrite.writeToFile(PATH_CUSTOMER, stringList, false);
    }

    @Override
    public void add(Customer customer) {
        List<String> list = new ArrayList<>();
        list.add(customer.getInfoToWrite());
        ReadAndWrite.writeToFile(PATH_CUSTOMER, list, true);
    }

    @Override
    public List<Customer> getList() {
        List<Customer> list = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        stringList = ReadAndWrite.readFromFile(PATH_CUSTOMER);
        for (String string :stringList) {
            String[] array = string.split(",");
            Customer customer = new Customer(array[0],array[1],array[2],array[3],array[4],array[5],array[6],array[7],array[8]);
            list.add(customer);
        }
        return list;
    }
}

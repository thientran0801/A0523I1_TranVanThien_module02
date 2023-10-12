package casestudy.service;


import casestudy.model.Customer;
import casestudy.repository.PromotionRepository;
import casestudy.utils.GetInput;

import java.util.Scanner;
import java.util.Set;

public class PromotionService extends GetInput implements IPromotionService {
    PromotionRepository promotionRepository = new PromotionRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void displayGetVoucher() {
        Set<Customer> customers = promotionRepository.getListGetVoucher();
        for (int i=0; i < customers.size(); i++) {
            System.out.println((i+1) +". " + customers);
        }
    }
    @Override
    public void getListCustomerUseService() {
        System.out.println("Enter the years you want to display the  list of customers who used the service:");
        int year = getNumber();
        Set<Customer> list = promotionRepository.getListUseService(year);
        for (Customer customer :list) {
            System.out.println(customer);
        }
    }
}

package CaseStudy2.model;

public class Customer extends Person{
    //Customer: Loại khách, Địa chỉ (resort sẽ phân loại Customer để áp dụng các chính sách phục vụ cho phù hợp).
    private String customerType, address;//Loại Customer bao gồm: (Diamond, Platinum, Gold, Silver, Member).

    public Customer() {
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name, String gender, String dob, String email, String id, String mail, int phoneNumber, int idCard, String customerType, String address) {
        super(name, gender, dob, email, id, mail, phoneNumber, idCard);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

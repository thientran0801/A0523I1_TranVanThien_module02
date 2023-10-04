package CaseStudy2.model;

public class Customer extends Person{
    //Customer: Loại khách, Địa chỉ (resort sẽ phân loại Customer để áp dụng các chính sách phục vụ cho phù hợp).
    private String customerType, address;//Loại Customer bao gồm: (Diamond, Platinum, Gold, Silver, Member).

//    public Customer() {
//    }
//
//    public Customer(String customerType, String address) {
//        this.customerType = customerType;
//        this.address = address;
//    }

    public Customer(String id, String name, String dob, String gender, String idCard, String phoneNumber, String email, String customerType, String address) {
        super(id, name, dob, gender, idCard, phoneNumber, email);
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

    public String getInfoToWrite() {
        return getId() + "," + getName() + "," + getDob() + "," + getGender() + "," + getIdCard() + "," + getPhoneNumber() + "," + getEmail() + "," + getCustomerType() + "," + getAddress();
    }

    @Override
    public String toString() {
        String name = String.format("%-20s", getName());
        String mail = String.format("%-30s", getEmail());
        String gender = String.format("%-3s", getGender());
        String address = String.format("%-30s", getAddress());
        return "ID: " + getId() + ", Name: " + name + ", Dob: " + getDob() + ", Gender:" + gender + ", IDCard: " + getIdCard() + ", Phone: " + getPhoneNumber() + ", Email: " + mail + ", Level: " + getCustomerType() + ", Position: " + address;
    }
}

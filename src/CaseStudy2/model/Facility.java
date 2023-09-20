package CaseStudy2.model;

public abstract class Facility {
    private String serviceCode;
    private String name;
    private int acreage;
    private int expense;
    private int maxPerson;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String name, int acreage, int expense, int maxPerson, String rentalType) {
        this.serviceCode = serviceCode;
        this.name = name;
        this.acreage = acreage;
        this.expense = expense;
        this.maxPerson = maxPerson;
        this.rentalType = rentalType;
    }

    //Các loại dịch vụ này sẽ bao có các thông tin: Mã dịch vụ, Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa,
    //1.	Xây dựng abstract class Facility (cơ sở vật chất) bao gồm các thông tin chung của tất cả dịch vụ cho thuê Villa, House, Room.

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcreage() {
        return acreage;
    }

    public void setAcreage(int acreage) {
        this.acreage = acreage;
    }

    public int getExpense() {
        return expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }
}

//4.	Xây dựng class Booking, Contract
//(Các class này được tạo trong package model)
//5.	Xây dựng interface Service với các method abstract chung cho các class
//6.	Xây dựng các interface IFacilityService, ICustomerService, IEmployeeService, IBookingService, IContactService kế thừa interface
// Service và định nghĩa thêm các method riêng nếu có
//7.	Xây dựng các class triển khai các interface trong mục 6 ở trên như: FacilityService, CustomerService, EmployeeService...
// (có thể để trống các class triển khai chưa cần code chức năng)
//(Các class này được tạo trong package service)
//8.	Xây dựng các interface IFacilityRepository, ICustomerRepository, IEmployeeRepository, IBookingRepository, IContactRepository
// kế thừa interface Repository và định nghĩa thêm các method riêng nếu có
//9.	Xây dựng các class triển khai các interface trong mục 6 ở trên như: FacilityRepository, CustomerRepository,
// EmployeeRepository... (có thể để trống các class triển khai chưa cần code chức năng)
//(Các class này được tạo trong package repository)
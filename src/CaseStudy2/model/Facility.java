package CaseStudy2.model;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private int acreage;
    private int expense;
    private int maxPerson;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, int acreage, int expense, int maxPerson, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.acreage = acreage;
        this.expense = expense;
        this.maxPerson = maxPerson;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}
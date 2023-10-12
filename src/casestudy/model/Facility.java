package casestudy.model;

public abstract class Facility {
    private String serviceCode, serviceName, rentalType;
    private double acreage, expense;
    private int maxPerson;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, double acreage, double expense, int maxPerson, String rentalType) {
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

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(int acreage) {
        this.acreage = acreage;
    }

    public double getExpense() {
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
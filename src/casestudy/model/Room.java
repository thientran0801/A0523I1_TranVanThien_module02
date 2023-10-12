package casestudy.model;

public class Room extends Facility {
    private String incentives;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, double acreage, double expense, int maxPerson, String rentalType, String incentives) {
        super(serviceCode, serviceName, acreage, expense, maxPerson, rentalType);
        this.incentives = incentives;
    }

    public String getIncentives() {
        return incentives;
    }

    public void setIncentives(String incentives) {
        this.incentives = incentives;
    }

    public String getInfoToWrite() {
        return getServiceCode() + "," + getServiceName() + "," + getAcreage() + "," + getExpense() + "," + getMaxPerson() + "," + getRentalType() + "," + getIncentives();
    }
    @Override
    public String toString() {
        String serviceName = String.format("%-15s", getServiceName());
        String acreeage = String.format("%-5s", getAcreage());
        String rental = String.format("%-5s", getRentalType());
        return "ID: " + getServiceCode() + ", Name: " + serviceName + ", Acreage: " + acreeage + ", Expense:" + getExpense() + ", Max person: " + getMaxPerson() + ", Rental type: " + rental + ", Incentives: " + getIncentives();
    }
}

package casestudy.model;

public class House extends Facility {
    private int numberOfFloor;
    private String roomStandard;

    public House() {
    }

    public House(String serviceCode, String serviceName, double acreage, double expense, int maxPerson, String rentalType, int numberOfFloor, String roomStandard) {
        super(serviceCode, serviceName, acreage, expense, maxPerson, rentalType);
        this.numberOfFloor = numberOfFloor;
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }
    public String getInfoToWrite() {
        return getServiceCode() + "," + getServiceName() + "," + getAcreage() + "," + getExpense() + "," + getMaxPerson() + "," + getRentalType() + "," + getNumberOfFloor() + "," + getRoomStandard();
    }
    @Override
    public String toString() {
        String serviceName = String.format("%-15s", getServiceName());
        String acreeage = String.format("%-5s", getAcreage());
        String rental = String.format("%-5s", getRentalType());
        return "ID: " + getServiceCode() + ", Name: " + serviceName + ", Acreage: " + acreeage + ", Expense:" + getExpense() + ", Max person: " + getMaxPerson() + ", Rental type: " + rental + ", Floor: " + getNumberOfFloor() + ", Standard: " + getRoomStandard();
    }
}

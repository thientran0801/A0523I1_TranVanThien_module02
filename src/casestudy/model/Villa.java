package casestudy.model;

public class Villa extends Facility{
    private int numberOfFloor;
    private String roomStandard;
    private double poolAcreage;

    public Villa() {
    }
    public Villa(String serviceCode, String serviceName, double acreage, double expense, int maxPerson, String rentalType, int numberOfFloor, String roomStandard, double poolAcreage) {
        super(serviceCode, serviceName, acreage, expense, maxPerson, rentalType);
        this.numberOfFloor = numberOfFloor;
        this.roomStandard = roomStandard;
        this.poolAcreage = poolAcreage;
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

    public double getPoolAcreage() {
        return poolAcreage;
    }

    public void setPoolAcreage(double poolAcreage) {
        this.poolAcreage = poolAcreage;
    }

    public String getInfoToWrite() {
        return getServiceCode() + "," + getServiceName() + "," + getAcreage() + "," + getExpense() + "," + getMaxPerson() + "," + getRentalType() + "," + getNumberOfFloor() + "," + getRoomStandard()+ "," + getPoolAcreage();
    }
    @Override
    public String toString() {
        String serviceName = String.format("%-15s", getServiceName());
        String acreeage = String.format("%-5s", getAcreage());
        String rental = String.format("%-5s", getRentalType());
        return "ID: " + getServiceCode() + ", Name: " + serviceName + ", Acreage: " + acreeage + ", Expense:" + getExpense() + ", Max person: " + getMaxPerson() + ", Rental type: " + rental + ", Floor: " + getNumberOfFloor() + ", Standard: " + getRoomStandard()+ ", Pool area: " + getPoolAcreage();
    }
}

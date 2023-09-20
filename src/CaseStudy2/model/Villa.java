package CaseStudy2.model;

public class Villa extends Facility{
    private int numberOfFloor;
    private String roomStandard;
    private int poolAcreage;

    public Villa() {
    }

    public Villa(int numberOfFloor, String roomStandard, int poolAcreage) {
        this.numberOfFloor = numberOfFloor;
        this.roomStandard = roomStandard;
        this.poolAcreage = poolAcreage;
    }

    public Villa(String serviceCode, String name, int acreage, int expense, int maxPerson, String rentalType, int numberOfFloor, String roomStandard, int poolAcreage) {
        super(serviceCode, name, acreage, expense, maxPerson, rentalType);
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

    public int getPoolAcreage() {
        return poolAcreage;
    }

    public void setPoolAcreage(int poolAcreage) {
        this.poolAcreage = poolAcreage;
    }
}

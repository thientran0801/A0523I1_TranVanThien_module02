package CaseStudy2.model;

public class House extends Facility{
    private int numberOfFloor;
    private String roomStandard;

    public House() {
    }

    public House(int numberOfFloor, String roomStandard) {
        this.numberOfFloor = numberOfFloor;
        this.roomStandard = roomStandard;
    }

    public House(String serviceCode, String name, int acreage, int expense, int maxPerson, String rentalType, int numberOfFloor, String roomStandard) {
        super(serviceCode, name, acreage, expense, maxPerson, rentalType);
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
}

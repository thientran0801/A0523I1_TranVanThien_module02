package CaseStudy2.model;

public class House extends Facility {
    private int numberOfFloor;
    private String roomStandard;


    public House(String serviceCode, String serviceName, int acreage, int expense, int maxPerson, String rentalType, int numberOfFloor, String roomStandard) {
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
}

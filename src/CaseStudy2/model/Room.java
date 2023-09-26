package CaseStudy2.model;

public class Room extends Facility {
    private String promotion;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, int acreage, int expense, int maxPerson, String rentalType, String promotion) {
        super(serviceCode, serviceName, acreage, expense, maxPerson, rentalType);
        this.promotion = promotion;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }
}

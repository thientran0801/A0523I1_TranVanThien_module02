package CaseStudy2.model;

public class Room extends Facility{
    //-	Riêng loại Room sẽ có thêm thông tin: Dịch vụ miễn phí đi kèm.

    private String promotion;

    public Room() {
    }

    public Room(String promotion) {
        this.promotion = promotion;
    }

    public Room(String serviceCode, String name, int acreage, int expense, int maxPerson, String rentalType, String promotion) {
        super(serviceCode, name, acreage, expense, maxPerson, rentalType);
        this.promotion = promotion;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }
}

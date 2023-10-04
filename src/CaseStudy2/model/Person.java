package CaseStudy2.model;

public abstract class Person {

    private String id, name, dob, gender, idCard, phoneNumber, email;//-	Mã phải đúng định dạng: NV-YYYY, với YYYY là các số từ 0-9.

    public Person(String id, String name, String dob, String gender, String idCard, String phoneNumber, String email) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.idCard = idCard;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

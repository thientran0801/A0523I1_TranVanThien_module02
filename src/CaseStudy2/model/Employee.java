package CaseStudy2.model;

public class Employee extends Person{
    private String level, position;
    private int salary;
    //Trình độ : Trung cấp, Cao đẳng, Đại học và Sau đại học
    //Vị trí: lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.


    public Employee() {
    }

    public Employee(String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String gender, String dob, String email, String id, String mail, int phoneNumber, int idCard, String level, String position, int salary) {
        super(name, gender, dob, email, id, mail, phoneNumber, idCard);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

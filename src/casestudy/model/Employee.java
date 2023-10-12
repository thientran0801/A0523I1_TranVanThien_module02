package casestudy.model;

public class Employee extends Person {
    private String level, position;
    private double salary;

    public Employee(String id, String name, String dob, String gender, String idCard, String phoneNumber, String email, String level, String position, double salary) {
        super(id, name, dob, gender, idCard, phoneNumber, email);
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInfoToWrite() {
        return getId() + "," + getName() + "," + getDob() + "," + getGender() + "," + getIdCard() + "," + getPhoneNumber() + "," + getEmail() + "," + getLevel() + "," + getPosition() + "," + getSalary();
    }

    @Override
    public String toString() {
        String name = String.format("%-20s", getName());
        String mail = String.format("%-30s", getEmail());
        String gender = String.format("%-3s", getGender());
        String position = String.format("%-10s", getPosition());
        return "ID: " + getId() + ", Name: " + name + ", Dob: " + getDob() + ", Gender:" + gender + ", IDCard: " + getIdCard() + ", Phone: " + getPhoneNumber() + ", Email: " + mail + ", Level: " + getLevel() + ", Position: " + position + ", Salary: " + getSalary();
    }
}

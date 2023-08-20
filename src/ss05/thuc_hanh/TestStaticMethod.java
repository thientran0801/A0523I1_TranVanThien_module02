package ss05.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student student1 = new Student(111, "Thiện");
        Student student2 = new Student(222, "Hiệp");
        Student student3 = new Student(333, "Vũ");

        student1.display();
        student2.display();
        student3.display();
    }
}

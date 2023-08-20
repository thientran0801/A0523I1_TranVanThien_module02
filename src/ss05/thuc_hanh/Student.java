package ss05.thuc_hanh;
public class Student {
    private int rollno;
    private String name;
    private static String college = "Da Nang university of science and technology";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

}

package ss6_inheritance;

public class Student extends Person {
    private int point;
    private String className;

    public Student() {
    }

    @Override
    public void howToGo() {
        System.out.println("đi băng xe máy");
    }

    @Override
    public void doTask() {
        System.out.println("học lý thuyết và làm bài tập");
    }

    public Student(int id, String name, int point, String className) {
        super(id, name);
        this.point = point;
        this.className = className;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Sinh viên{" +
                "id=" + super.getId() +
                "name=" + super.getName() +
                "point=" + point +
                '}';
    }


    public void study(String subject){
        System.out.println(" sinh viên đang học môn "+ subject);
    }

}

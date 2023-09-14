package ss6_inheritance;

public class Instructor extends Employee implements IAttendance{

    public void teach(String subject){
        System.out.println("giảng viên "+super.getName()+ "đang dạy môn "+ subject);
    }

    @Override
    public void doTask() {
        System.out.println("dạy lý thuyết và thực hành");
    }

    @Override
    public void attendance() {
        System.out.println("GV có thể điểm danh");
    }
}

package ss6_inheritance;

public class Ministry extends Employee implements IAttendanceAndGame {
    // thêm một số thuộc tính riêng nếu có

    public Ministry() {
    }

    @Override
    public void doTask() {
        System.out.println("điểm danh ....");
    }

    public Ministry(int id, String name, float salary) {
        super(id, name, salary);
    }

    @Override
    public void attendance() {
        System.out.println("GV điểm danh");
    }

    @Override
    public void organizeGame() {
        System.out.println("tổ chức chơi game");
    }
}

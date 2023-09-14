package ss11_stack_queue;

import ss8_mvc.model.Student;

import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
    public static void main(String[] args) {
        List list = new ArrayList();
        List<Student> studentList = new ArrayList();
        list.add(1);
        list.add("hello");
        list.add(new Student());
        ((Student)list.get(2)).study();

        studentList.add(new Student());
        // phát hiện lỗi tại thời điểm compiler
//        studentList.add("abc");
        // không phải ép kiểu
        studentList.get(0).study();
        // sử dụng Generic tự định nghĩa
        Box<Integer> box = new Box<>();
        box.setData(1);
        System.out.println(box.getData());
        Box<Student> studentBox = new Box<>();
        studentBox.setData(new Student());
        System.out.println(studentBox.getData());
    }
}

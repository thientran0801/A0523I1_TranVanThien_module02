package ss6_inheritance;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student(1,"Chanh",2);
//        student.howToGo();
//        Instructor instructor = new Instructor();
//        instructor.setName("Hải");
//        instructor.teach("Toán");
//        System.out.println(student);
//        student.study("JS");

        // ép kiểu ngầm Định
        Person p = new Student(1,"Tiến",2,"A05");
        // p có bao nhiều kiểu dữ liêu?
        // hiên tại p đang dùng kiểu dữ liệu nào?
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Student);
//        p.study();// đang có kiểu p
        p.howToGo();// đang gọi method của cha
        // nhưng khi chạy lên thì gọi method con
        //ép kiểu tường minh
        ((Student)p).study();
        //
        Student[] students = new Student[100];
        Person[] people = new Person[100];
        people[0] = new Student();
        people[1] = new Instructor();
        people[2] = new Seller();

        for (Person person: people) {
            if (person instanceof Student){
                ((Student)person).study();
            }
        }
    }
}

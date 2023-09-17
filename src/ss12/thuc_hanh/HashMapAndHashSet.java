package ss12.thuc_hanh;

import java.util.*;

public class HashMapAndHashSet {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");
        // write your code here
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(3,student2);
        studentMap.put(2,student3);
        studentMap.put(0,student1);

        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<>();
//        students.add(student3);//ha
//        students.add(student1);//nam
//        students.add(student2);//hung
//        Student = Hung, age= 21, address= HN
//        Student = Nam, age= 20, address= HN
//        Student = Ha, age= 22, address= HN
//        students.add(student1);//nam
//        students.add(student2);//hung
//        students.add(student3);//ha
//        Student = Ha, age= 22, address= HN
//        Student = Hung, age= 21, address= HN
//        Student = Nam, age= 20, address= HN
        students.add(student2);//hung
        students.add(student1);//nam
        students.add(student3);//ha
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}

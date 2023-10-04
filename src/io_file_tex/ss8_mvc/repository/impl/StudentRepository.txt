package ss8_mvc.repository.impl;

import ss8_mvc.model.CompaById;
import ss8_mvc.model.Student;
import ss8_mvc.repository.IStudentRepository;
import ss8_mvc.util.ReadAndWrite;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final String PATH_STUDENT ="D:\\codegym\\demo2023\\module2\\A0523I1\\module2\\src\\ss8_mvc\\data\\student.csv";

    @Override
    public List<Student> getListStudent() {
        List<Student> studentList = new ArrayList<>();
        // đọc  file ở đây hoặc kết nối DB
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_STUDENT);
        // chuyển thành list student
        String[] array = null;
        for (String string: stringList) {
            array = string.split(",");
            Student student = new Student(Integer.parseInt(array[0]),array[1],array[2]);
            studentList.add(student);
        }
        return studentList;
    }

    @Override
    public List<Student> searchByName(String searchName) {
        List<Student> studentList = getListStudent();
        List<Student> searchList = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().contains(searchName)){
                searchList.add(studentList.get(i));
            }
        }
        return searchList;
    }

    @Override
    public void addStudent(Student student) {
        List<String> stringList = new ArrayList<>();
        stringList.add(student.getInfoToCSV());
        ReadAndWrite.writeToCSV(PATH_STUDENT,stringList,true);
    }

    @Override
    public void deleteStudentById(int id) {
     List<Student> studentList = getListStudent();
        for (int i = 0; i <studentList.size() ; i++) {
            if (studentList.get(i).getId()==id){
                studentList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Student student: studentList) {
            stringList.add(student.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_STUDENT,stringList,false);

    }
    @Override
    public List<Student> sortByClassName() {
        // sắp xếp theo class name
        return null;
    }
}

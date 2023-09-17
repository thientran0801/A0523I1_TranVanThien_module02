package ss11.bai_tap;

import java.io.*;
import java.util.*;

class Employee {
    String name;
    String gender;
    String dob;

    public Employee(String name, String gender, String dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }
}

public class EmployeeDataOrganization {
    public static void main(String[] args) {
        Queue<Employee> femaleQueue = new LinkedList<>();
        Queue<Employee> maleQueue = new LinkedList<>();

        try {
            // Đọc dữ liệu từ file và sắp xếp theo ngày tháng năm sinh
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;
            List<Employee> employees = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String gender = parts[1];
                String dob = parts[2];
                employees.add(new Employee(name, gender, dob));
            }
            br.close();

            // Sắp xếp danh sách theo ngày tháng năm sinh
            Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee e1, Employee e2) {
                    // Điều này giả sử ngày tháng năm sinh có định dạng "dd/MM/yyyy"
                    return e1.dob.compareTo(e2.dob);
                }
            });

            // Tách dữ liệu theo giới tính
            for (Employee employee : employees) {
                if (employee.gender.equals("Nữ")) {
                    femaleQueue.add(employee);
                } else if (employee.gender.equals("Nam")) {
                    maleQueue.add(employee);
                }
            }

            // Ghi dữ liệu vào file đầu ra
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            while (!femaleQueue.isEmpty()) {
                Employee femaleEmployee = femaleQueue.poll();
                bw.write(femaleEmployee.name + "," + femaleEmployee.gender + "," + femaleEmployee.dob);
                bw.newLine();
            }
            while (!maleQueue.isEmpty()) {
                Employee maleEmployee = maleQueue.poll();
                bw.write(maleEmployee.name + "," + maleEmployee.gender + "," + maleEmployee.dob);
                bw.newLine();
            }
            bw.close();

            System.out.println("Dữ liệu đã được tổ chức lại và ghi vào file output.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


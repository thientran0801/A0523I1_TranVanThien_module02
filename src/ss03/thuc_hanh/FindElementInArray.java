package ss03.thuc_hanh;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michanel", "Camila", "Siema", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name's student: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the student in the list m"+input_name+" is "+ (i + 1));
                isExist = true;
            }
        }
        if (!isExist){
            System.out.println("Not found "+ input_name+" in the list" );
        }
    }
}

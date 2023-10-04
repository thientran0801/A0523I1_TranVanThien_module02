package ss16.bai_tap;

import java.io.*;
import java.util.Scanner;

public class CopyFIleText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter link file nguồn: ");
//        final String PATH_SOURCE = scanner.nextLine();
        final String PATH_SOURCE = "D:\\codegym\\module02\\src\\ss16\\bai_tap\\source.csv";
        System.out.println("Enter link file đích: ");
//        final String PATH_TARGET = scanner.nextLine();
        final String PATH_TARGET = "D:\\codegym\\module02\\src\\ss16\\bai_tap\\target.csv";

        try {
            File fileSource = new File(PATH_SOURCE);
            File fileTarget = new File(PATH_TARGET);
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            if (!fileTarget.exists()) {
                System.out.println("File dich khong ton tai!!!");
                throw new Exception();
            }
            if (!fileSource.exists()) {
                System.out.println("File nguon khong ton tai!!!");
                throw new Exception();
            }
            fileReader = new FileReader(fileSource);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(fileTarget, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

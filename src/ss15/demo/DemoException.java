package ss15.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
        System.out.println("Bắt đầu chương trình");
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        do {
            flag =false;
            try {
                System.out.println("nhập tuổi");
                int age = Integer.parseInt(scanner.nextLine());
                checkAge(age);
                System.out.println(" Tuổi ok");
            }catch (MyAgeException e){
                flag = true;
                System.out.println(e.getMessage());
                System.out.println("nhập lại");
            }catch (Exception e){
                flag = true;
                System.out.println(e.getMessage());
            }
        }while (flag);

        System.out.println("Kết thúc chương trình");
    }

    public static void method1() {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào index mà muốn lấy ra");
        int i = -1;
        try {
            String str = scanner.nextLine();
            i = Integer.parseInt(str);
            System.out.println("vị trí mới nhập " + i);
            System.out.println("phần tử cần lấy " + arr[i]);

        } catch (NumberFormatException e) {
            System.out.println("lỗi do nhập chuỗi");
            i = 0;
            System.out.println("phần tử cần lấy " + arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("do ngoài pt của mảng");
            i = arr.length - 1;
            System.out.println("phần tử cần lấy " + arr[i]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(" luôn luôn chạy cho du exception có xả ra hay không");
        }


    }

    public static void method2(String pathFile) throws FileNotFoundException {
        File file = new File(pathFile);
        FileReader fileReader = new FileReader(file);
    }
    public static boolean checkAge(int age) throws MyAgeException {
        if (age<0){
            throw  new MyAgeException("Tuổi đang nhỏ hơn không");
        }else if (age>100){
            throw  new MyAgeException("Tổi đang lớn hơn 100");
        }
        return true;
    }
}

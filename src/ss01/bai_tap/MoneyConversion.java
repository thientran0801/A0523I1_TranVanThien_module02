package ss01.bai_tap;

import java.util.Scanner;

public class MoneyConversion {
    public static void main(String[] args) {
        System.out.println("Nhập số tiền bạn muốn đổi (USD): ");
        Scanner scanner = new Scanner(System.in);
        final  int VND = 23747;
        int USA;
        USA = scanner.nextInt();
        System.out.println(USA+" USD tương đương với "+USA*VND+" VND");
    }

}

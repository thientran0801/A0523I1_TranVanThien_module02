package ss14.thuc_hanh;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Before sort list: ");
        int[] list = {5, 4, 8, 5, 10, 65, 45, 78, 99, 54, 12, 66, 44, 85, 45};
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        bubbleSort(list);
        System.out.println("\nAfter sort list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
    public static void bubbleSort(int[] list) {
        boolean needNextLoop = true;

        for (int i = 0; i < list.length && needNextLoop; i++) {
            needNextLoop = false;

            for (int j = list.length - 1; j > i ; j--) {
                if (list[j] < list[j-1]) {
                    int temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                    needNextLoop = true;
                }
            }
        }
    }

}
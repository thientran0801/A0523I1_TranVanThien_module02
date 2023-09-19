package ss14.bai_tap;

public class InsertionSort {
    static int list[] = {5, 8, 52, 65, 54, 2, 5, 89, 6, 2,};

    public static void insertionSort(int[] list) {
//        int pos, x;
//        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
//            x = array[i];
//            pos = i;
//            while(pos > 0 && x < array[pos-1]){
//                array[pos] = array[pos-1]; // đổi chỗ
//                pos--;
//            }
//            array[pos] = x;
        for (int i = 1; i < list.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (list[j] > list[j + 1]) {
                    int current = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = current;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\nYour list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        insertionSort(list);
        System.out.println("\nList after sorting: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}

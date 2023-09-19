package ss14.thuc_hanh;

public class SelectionSort {
    static double[] list = new double[]{5.2, 6.3, 4.1, 4.5, 5, 6.3};

    public static void selectionSort(double list[]) {
        for (int i = 0; i < list.length - 1; i++) {
            double min = list[i];
            int indexMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                list[indexMin] = list[i];
                list[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Your list: ");
        for (double d : list) {
            System.out.print(d + "   ");
        }
        selectionSort(list);
        System.out.println("\nList after sort: ");
        for (double d : list) {
            System.out.print(d + "   ");
        }
    }
}

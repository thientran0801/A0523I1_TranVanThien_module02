package ss12.thuc_hanh;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;
public class ArraySorting {
    public static void main(String[] args) {
        int arrayNumber[] = new int[] {9,8,7,6,1};
        Arrays.sort(arrayNumber);
        Arrays.stream(arrayNumber).forEach(System.out::print);
        System.out.println();
        Simpson[] simpsons = new Simpson[]{new Simpson("Lisa"), new Simpson("Homer")};

        Arrays.sort(simpsons);
//        Arrays.stream(simpsons).forEach(System.out::println);
        for (Simpson c: simpsons) {
            System.out.print(c.name + " ");
        }

    }
}

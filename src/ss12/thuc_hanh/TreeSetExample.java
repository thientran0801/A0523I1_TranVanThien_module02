package ss12.thuc_hanh;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Simpson> simpsons = new TreeSet<>();
        simpsons.add(new Simpson("Moe"));
        simpsons.add(new Simpson("Lenny"));
        simpsons.add(new Simpson("Homer"));
        simpsons.add(new Simpson("Barney"));

        System.out.println(simpsons);
    }
}

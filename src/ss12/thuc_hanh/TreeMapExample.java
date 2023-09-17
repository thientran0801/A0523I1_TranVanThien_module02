package ss12.thuc_hanh;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Simpson, String> simpsons = new TreeMap<>();
        simpsons.put(new Simpson("Moe"), "shotgun");
        simpsons.put(new Simpson("Lenny"), "Carl");
        simpsons.put(new Simpson("Homer"), "television");
        simpsons.put(new Simpson("Barney"), "beer");

        System.out.println(simpsons);
    }
}

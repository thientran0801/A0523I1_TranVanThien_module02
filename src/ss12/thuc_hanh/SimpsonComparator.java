package ss12.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SimpsonComparator {
    public static void main(String[] args) {
//        List<Simpson> simpsons = new ArrayList<>();
//
//        Simpson homer = new Simpson("Homer") {
//            @Override
//            public int compareTo(Simpson simpson) {
//                return this.name.length() - (simpson.name.length());
//            }
//        };
//        Simpson moe = new Simpson("Moe") {
//            @Override
//            public int compareTo(Simpson simpson) {
//                return this.name.length() - (simpson.name.length());
//            }
//        };
//        simpsons.add(homer);
//        simpsons.add(moe);
//        Collections.sort(simpsons);
//        System.out.println(simpsons);


        List<Simpson> simpsons = new ArrayList<>();

        Simpson homer = new Simpson("Homer");
        Simpson moe = new Simpson("Moe");

        simpsons.add(homer);
        simpsons.add(moe);
//c1
//        Collections.sort(simpsons, (Comparator.<Simpson>
//                        comparingInt(character1 -> character1.name.length())
//                .thenComparingInt(character2 -> character2.name.length())));
        //[Moe , Homer ]

        //c2
        Comparator comparatorSimpson = new CompareSimpson();
        Collections.sort(simpsons, comparatorSimpson);
        System.out.println(simpsons);
    }
}
//Comparator.<Simpson>comparingInt(character1 -> character1.name.length()).thenComparingInt(character2 -> character2.name.length())
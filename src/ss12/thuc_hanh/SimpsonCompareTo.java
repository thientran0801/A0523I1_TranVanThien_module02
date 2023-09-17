package ss12.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SimpsonCompareTo {
    public static void main(String[] args) {
        List<Simpson> simpsons = new ArrayList<>();
        simpsons.add(new Simpson("Homer"));
        simpsons.add(new Simpson("Marge"));
        simpsons.add(new Simpson("Bart"));
        simpsons.add(new Simpson("Lisa"));

        Collections.sort(simpsons);
        System.out.println(simpsons.stream().map(s->s.name).collect(Collectors.joining(" ")));
//        simpsons.stream().map(s->s.name).forEach(System.out::print);

        Collections.reverse(simpsons);
        System.out.println(simpsons.stream().map(s->s.name).collect(Collectors.joining(" ")));
    }
}

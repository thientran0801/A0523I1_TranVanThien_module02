package ss12.thuc_hanh;

import java.util.Comparator;

public class Compare implements Comparator<Simpson> {

    @Override
    public int compare(Simpson o1, Simpson o2) {
        return o1.name.length() - o2.name.length();
    }
}

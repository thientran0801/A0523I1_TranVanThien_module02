package ss12.thuc_hanh;

public class Simpson implements Comparable<Simpson>{
    String name;

    public Simpson(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Simpson o) {
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString(){
        return this.name + " ";
    }
}

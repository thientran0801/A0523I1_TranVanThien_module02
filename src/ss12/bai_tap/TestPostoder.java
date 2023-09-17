package ss12.bai_tap;

public class TestPostoder {
    public static void main(String[] args) {
        PostoderTree<Integer> tree = new PostoderTree<>();

        tree.insert(8);
        tree.insert(6);
        tree.insert(9);
        tree.insert(7);
        tree.insert(5);
        tree.insert(10);

        System.out.println("All element in tree (sorted): ");
        tree.postoder();
    }
}

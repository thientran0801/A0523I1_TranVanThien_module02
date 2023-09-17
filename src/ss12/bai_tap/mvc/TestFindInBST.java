package ss12.bai_tap.mvc;

import ss12.bai_tap.FindInBST;

public class TestFindInBST {
    public static void main(String[] args) {
        FindInBST<Integer> tree = new FindInBST<>();

        tree.insert(10);
        tree.insert(20);
        tree.insert(50);
        tree.insert(40);
        tree.insert(30);
        tree.insert(8);
        tree.insert(9);
        tree.insert(7);
        tree.insert(2);
        tree.insert(100);

        System.out.println("All element in  Tree: ");
        tree.postoder();

        System.out.println("Does element 8 exist: " + tree.find(8));
        System.out.println("Does element 5 exist: " + tree.find(5));
        System.out.println("Does element 120 exist: " + tree.find(120));
        System.out.println("Does element 50 exist: " + tree.find(50));
    }
}

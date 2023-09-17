package ss12.bai_tap;

public class PostoderTree<E extends Comparable> {
    private NodeTree<E> root = null;
    private int size = 0;

    public PostoderTree() {

    }

    public PostoderTree(E[] objects) {
        for (E element : objects) {
            insert(element);
        }
    }

    public boolean insert(E e) {
        if (root == null) {
            root = new NodeTree<>(e);
        } else {
            NodeTree<E> parent = null;
            NodeTree<E> current = root;

            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = new NodeTree<>(e);
            } else {
                parent.right = new NodeTree<>(e);
            }
        }
        size++;
        return true;
    }

    public int getSize() {
        return this.size;
    }

    public void postoder() {
        postoder(this.root);
    }

    public void postoder(NodeTree<E> node) {
        if (node == null) {
            return;
        }
        System.out.println(node.element + "");
        postoder(node.left);
        postoder(node.right);
    }

    private class NodeTree<E> {
        E element;
        NodeTree<E> left;
        NodeTree<E> right;

        public NodeTree(E element) {
            this.element = element;
        }
    }
}

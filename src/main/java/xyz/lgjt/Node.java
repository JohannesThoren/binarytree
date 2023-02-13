package xyz.lgjt;

public class Node {
    private Node left;
    private Node right;
    private final int value;

    public Node(int x) {
        value = x;
    }

    public void insert(int x) {
        if (x >= value) {
            if (right == null)
                right = new Node(x);
            else
                right.insert(x);
        } else {
            if (left == null)
                left = new Node(x);
            else
                left.insert(x);
        }
    }

    public boolean contains(int x) {
        if (x == value)
            return true;
        else if (x < value && left != null)
            return left.contains(x);
        else if (x > value && right != null)
            return right.contains(x);
        else return false;
    }

    public void orderedPrint() {
        if (left != null)
            left.orderedPrint();

        System.out.println(value);

        if (right != null)
            right.orderedPrint();
    }
}

package xyz.lgjt;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(10);

        root.insert(20);
        root.insert(8);
        root.insert(9);
        root.insert(25);
        root.insert(100);
        root.insert(18);
        root.insert(19);

        System.out.println(root.contains(20));

        root.orderedPrint();
    }
}
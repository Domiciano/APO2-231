public class Main {

    public static void main(String[] args) {
        BST tree = new BST();
        Node a = new Node("Miguel");
        Node b = new Node("Sebastian");
        Node c = new Node("Juan");
        Node d = new Node("Santiago");
        Node e = new Node("Lina");
        Node f = new Node("Laura");
        tree.add(a);
        tree.add(b);
        tree.add(c);
        tree.add(d);
        tree.add(e);
        tree.add(f);

        System.out.println(e.getLeft().getKey());


    }

}
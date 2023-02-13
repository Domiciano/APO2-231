public class Main {
    public static void main(String[] args) {

        CircularList list = new CircularList();
        list.addNode(new Node("A"));
        list.addNode(new Node("L"));
        list.addNode(new Node("C"));
        list.addNode(new Node("Z"));
        list.addNode(new Node("G"));
        list.addNode(new Node("P"));
        list.addNode(new Node("W"));

        list.print();

    }
}
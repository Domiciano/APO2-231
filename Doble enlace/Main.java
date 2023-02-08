public class Main {
    public static void main(String[] args) {
        DobleEnlace lista = new DobleEnlace();
        lista.addNode(
                new Node("A")
        );
        lista.addNode(
                new Node("B")
        );
        lista.addNode(
                new Node("C")
        );
        lista.addNode(
                new Node("D")
        );
        lista.addFirst(
                new Node("Z")
        );
        lista.print();
        lista.delete("C");
        System.out.println("----");
        lista.print();

    }
}
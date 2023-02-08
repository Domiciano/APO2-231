public class DobleEnlace {
    private Node head;
    private Node tail;

    public void addNode(Node node){
        if(head==null){
            head = node;
            tail = node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
    }

    public void addFirst(Node node){
        if(head==null){
            head = node;
            tail = node;
        }else{
            node.setNext(head);
            head.setPrevious(node);
            head = node;
        }
    }

    //Activacion
    public void print(){
        print(head);
    }

    //Recursivo
    private void print(Node current){
        if(current == null){
            return;
        }
        System.out.println(current.getName());
        print(current.getNext());
    }

    //Eliminacion
    public void delete(String goal){
        delete(head, goal);
    }
    private void delete(Node current, String goal){
        if(current == null){
            return;
        }
        if(current.getName().equals(goal)){
            //Eliminar
            Node prev = current.getPrevious();
            Node next = current.getNext();
            prev.setNext(next);
            next.setPrevious(prev);
            return;
        }
        delete(current.getNext(), goal);

    }




}

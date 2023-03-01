public class BST {

    private Node root;



    public void add(Node node){
        if(root == null){
            root = node;
        }else{
            add(root, node);
        }
    }
    private void add(Node current, Node node){
        if(node.getKey().compareTo(current.getKey()) < 0){
          //Meter a la izquierda
            if(current.getLeft() == null){
                current.setLeft(node);
            }else{
                add(current.getLeft(), node);
            }
        }else if(node.getKey().compareTo(current.getKey()) > 0){
            //Meter a la derecha
            if(current.getRight() == null){
                current.setRight(node);
            }else{
                add(current.getRight(), node);
            }

        }else{
            //No hacer nada
        }
    }

    public Node getMin(){
        return getMin(root);
    }

    private Node getMin(Node current){
        if(current.getLeft() == null){
            return current;
        }
        return getMin(current.getLeft());
    }

    public Node getMax(){
        return getMax(root);
    }

    private Node getMax(Node current){
        if(current.getRight() == null){
            return current;
        }
        return getMax(current.getRight());
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node current){
        if(current == null){
            return;
        }
        inOrder(current.getLeft());
        System.out.println(current.getKey());
        inOrder(current.getRight());
    }

    public Node search(String goal){
        return search(root, goal);
    }

    private Node search(Node current, String goal){
        if(current == null){
            System.out.println("Not found");
            return null;
        }
        if(current.getKey().equals(goal)){
            return current;
        }

        if(goal.compareTo(current.getKey()) < 0){
            return search(current.getLeft(), goal);
        }else{
            return search(current.getRight(), goal);
        }

    }

    public void delete(String goal){
        delete(null, root, goal);
    }

    private void delete(Node parent, Node current, String goal){
        if(current == null){
            return;
        }
        //Encontramos al nodo
        if(goal.equals(current.getKey())){
            //Es un nodo hoja
            if(current.getRight() == null && current.getLeft() == null){
                if(parent.getLeft() == current) parent.setLeft(null);
                else parent.setRight(null);
            }
            //Eliminar un nodo que tiene hijo derecho
            else if(current.getRight() != null && current.getLeft() == null){
                if(parent.getLeft() == current) parent.setLeft(current.getRight());
                else parent.setRight(current.getRight());
            }
            //Eliminar un nodo que tiene hijo izquierdo
            else if(current.getRight() == null && current.getLeft() != null){
                if(parent.getLeft() == current) parent.setLeft(current.getLeft());
                else parent.setRight(current.getLeft());
            }
            //Eliminar un nodo que tiene dos hijos
            else if(current.getRight() != null && current.getLeft()!=null){
                Node sucessor = getMin(current.getRight());
                //Sobrescribir la key y los valores
                current.setKey(sucessor.getKey());
                //Si tienen valores hacer current.setValue(sucessor.getValue())
                delete(current, current.getRight(), sucessor.getKey());
            }
        }
        else if(goal.compareTo(current.getKey()) < 0){
            delete(current, current.getLeft(), goal);
        }else if(goal.compareTo(current.getKey()) > 0){
            delete(current, current.getRight(), goal);
        }
    }



}

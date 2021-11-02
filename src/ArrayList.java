public class ArrayList<T> {
    private Node root;
    private int length;

    public ArrayList(){
        root=new Node();
        length = 1;
    }
    public boolean add(T data){
        if (length==1){//if it is the second value to be added, then it adds it in special way
            Node n = new Node(data, root, null);
            root.set_next(n);

            } else {
            Node n = new Node(data,recur(root), null);//sets the previous node to the last node on the end of the line
            recurPrev(root).set_next(recur(root));//sets the old last node to have a next node value of the new node n
        }
        return true;
    }
    private Node<T> recur(Node<T> n2){//returns the last node in the chain
        if(n2.getNext()==null){//checks if the current node is the last in the chain and if it does it returns the node
    return n2;
        }
        recur(n2.getNext());//runs the method again on the child node of the previous node
        return null;

    }
    private Node<T> recurPrev(Node<T> n2){//returns the second to last node using similar process to the previous one. 
        if(n2.getNext()==null){
            return n2.getPrev();
        }
        recur(n2.getNext());
        return null;

    }

}

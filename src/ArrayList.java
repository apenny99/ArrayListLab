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


    public void add(int i, T data){//adds a node at the integer i with data value T
        Node n2=new Node(data);

        n2.set_next(index(i+1,0,root));
        index(i,0,root).set_next(n2);
        length++;


    }
    private Node<T> recur(Node<T> n2){//returns the last node in the chain
        if(n2.getNext()==null){//checks if the current node is the last in the chain and if it does it returns the node
            return n2;
        }
        return recur(n2.getNext());//runs the method again on the child node of the previous node
    }

    private Node<T> index(int end, int start, Node<T> root){
        if (end == start){
            return root;
        }
        return index(end, start+=1, root.getNext());
    }

    public T set(int i, T data){
        T prev = new T.get(i);
        T newValue = new T.get(i);
        newValue = data;
        return prev;

    }
}


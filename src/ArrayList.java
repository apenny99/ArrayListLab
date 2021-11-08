public class ArrayList<T> {
    private Node<T> root;
    private int length;

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        Node test = a.index(2, 0, a.getRoot());
        System.out.println(test.toString());
        System.out.println(a.get(0));
        System.out.println(a.get(-1));
        a.remove(2);
        test = a.index(2, 0, a.getRoot());
        System.out.println(test.toString());
    }

    public ArrayList(){
        root = new Node(0);
        length = 1;
    }

    public Node<T> getRoot(){
        return root;
    }

    public boolean add(T data){
        Node n = new Node(data,recur(root), null);//sets the previous node to the last node on the end of the line
        recur(root).set_next(n);
        length++;
        return true;
    }

    public void remove(int n){
        index(n, 0, root).getNext().set_prev(index(n, 0, root).getPrev());
        index(n, 0, root).getPrev().set_next(index(n, 0, root).getNext());
        length--;
        //index(n, 0, root) = null;
    }

    public T get(int n){
        if (n < 0){
            n+=length;
        }
        return index(n, 0, root).get_data();
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

}
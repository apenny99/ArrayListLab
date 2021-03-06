/**
* ArrayList Lab
* This is the code for the all of the merged methods that are essential for an arraylist 
* Authors: William Writer, August Penny, Zion Choi
* Collaborator(s): The names of anyone you collaborated with here
* Collaboration: We talked over everything we did whether that was making the methods, pushing code, or merging the branches.
* Date: 11/8/21
* On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: WW, AP, ZC
**/
public class ArrayList<T> {
    private Node root;
    private int length;



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
        return true;


    public void add(int i, T data){//adds a node at the integer i with data value T
        Node n2=new Node(data);

        n2.set_next(index(i+1,0,root));
        index(i,0,root).set_next(n2);
        length++;


    }

    public void remove(int n){
        index(n, 0, root).getNext().set_prev(index(n, 0, root).getPrev());
        index(n, 0, root).getPrev().set_next(index(n, 0, root).getNext());
        //index(n, 0, root) = null;
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
    public int size(){
        return this.length;
    }
        
        public T get(int n){
        if (n < 0){
            n+=length;
        }
        return index(n, 0, root).get_data();
    }
}


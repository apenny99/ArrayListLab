public class ArrayList<T> {
    private Node root;
    private int length;

    public ArrayList(){
        root=new Node();
        length = 1;
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
}


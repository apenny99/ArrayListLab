/**
* ArrayList Lab
* This is the code for the set Method where you change a value of a selected part of the array
* Author: William Writer
* Collaborator(s): The names of anyone you collaborated with here
* Collaboration: We talked over everything we did whether that was making the methods, pushing code, or merging the branches.
* Date: 11/8/21
* On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: WW, AP, ZC
**/
public class ArrayList<T> {
    private Node root;
    private int length;

    public ArrayList(){ // default constructor
        root=new Node();
        length = 1;
    }
    public T set(int i, T data){ // set method
        T prev = new T.get(i);
        T newValue = new T.get(i);
        newValue = data;
        return prev;

    }
}

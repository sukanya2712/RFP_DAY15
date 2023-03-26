package BinarySearchTree;

public class BinarySearch <T extends Comparable<T>>{
    INode<T> root;

    //uc1
    public void add(T data){
        INode<T> newNode = new INode<>(data);
        if(root == null) {
            root = newNode;
            return;
        }
        INode<T> currentPointer= root;
        while(currentPointer.NextRN != null && currentPointer.NextLN != null) {
            if (data.compareTo(currentPointer.data) < 0) {
                currentPointer = currentPointer.NextLN;
            } else {
                currentPointer = currentPointer.NextRN;
            }
        }
        if(data.compareTo(currentPointer.data) < 0)
            currentPointer.NextLN= newNode;
        else
            currentPointer.NextRN= newNode;
    }


}

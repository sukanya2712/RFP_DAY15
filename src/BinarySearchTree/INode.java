package BinarySearchTree;

public class INode<T extends Comparable<T>> {
    T data;
    INode<T> NextRN;
    INode<T> NextLN;

    public INode(T data){
        this.data = data;
    }
}

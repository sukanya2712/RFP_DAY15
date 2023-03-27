package BinarySearchTree;

import java.util.Arrays;

public class BinarySearch <T extends Comparable<T>>{
    INode<T> root;
     INode<T> currentPointer;
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

    public void search(T data){


        while(currentPointer!=null) {
            int value= data.compareTo(currentPointer.data);
            switch (value){
                case -1:
                    currentPointer = currentPointer.NextLN;
                    break;
                case 1:
                    currentPointer = currentPointer.NextRN;
                    break;
                default:
                    System.out.println("Element Found!!!");
                    return;
            }
        }
        System.out.println("Element Not Found!!!");
    }

}

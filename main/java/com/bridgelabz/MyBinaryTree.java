package com.bridgelabz;

public class MyBinaryTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public void add(K key) {

        this.root = this.addRecursively(root, key);
    }

    public MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) {
            return current;
        }
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    public int getSizeRecursive(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
                + this.getSizeRecursive(current.right);
    }






    public  boolean search(MyBinaryNode  root, K nodeToBeSearched)
    {
        if(root==null)
            return false;
        if(root.key== nodeToBeSearched)
        {
            return true;
        }
        boolean result=false;

        if(root.key.compareTo(nodeToBeSearched)>0)
            result=search(root.left,nodeToBeSearched);
        else if(root.key.compareTo(nodeToBeSearched)<0)
            result= search(root.right,nodeToBeSearched);

        return result;
    }

    public  boolean search1(K key){

    return search(root,key);
    }


}
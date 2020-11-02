package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
    @Test
    public void given3NumberWhenAddedToBinaryTree_ShouldReturnSizeThree(){
        MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);

        myBinaryTree.add(10);
        myBinaryTree.add(450);
        myBinaryTree.add(8);
        int size =myBinaryTree.getSize();
        Assert.assertEquals(6,size);
    }


}

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

    @Test
    public void givenNumber_WhenAddedToBinaryTree_ShouldReturnSizeThree(){
        MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int size =myBinaryTree.getSize();
        Assert.assertEquals(13,size);
    }

    @Test
    public void givenTree_whenMatchesSearch_ShouldReturnTrue(){

        MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        System.out.println(myBinaryTree);
        boolean result=myBinaryTree.search1(63);
       // System.out.println("Searching for node 55 : "+result);
        Assert.assertEquals(true,result);
    }




}

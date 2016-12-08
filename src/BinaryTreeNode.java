//BinaryTreeNode.java
//Your name
//Nodes for the BinaryTree class


//******* DO NOT ALTER THIS FILE ************
package binarytree;

public class BinaryTreeNode {
    //Package level protection on all fields to make using the nodes in the 
    //  tree easier
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    
    BinaryTreeNode() {
        data = 0;
        left = null;
        right = null;
    }
    
    BinaryTreeNode(int val) {
        data = val;
        left = null;
        right = null;
    }
    
    BinaryTreeNode(int val, BinaryTreeNode l, BinaryTreeNode r) {
        data = val;
        left = l;
        right = r;
    }
}

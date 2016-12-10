//BinaryTree.java
//Steve Browning
//This is the skeleton for the final project for CIS 273 Fall 2016


import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author stevebrowning
 */
//****** Do not change any code in this file. You may add to it but do not
//          delete or alter anything that is already here. The only exception
//          is if you want to create a different tree than the one I've
//          created. You may change the constructor and createNodes().
//       
//       Understand that I might create my own tree to test your code. Don't
//          count on the constructor to create a certain tree.
public class BinaryTree {

    protected BinaryTreeNode root;

    BinaryTree() {
        /*
        This constructor will build a binary tree that has 15 elements
        numbered like this
                                    1
                         2                      3
                  4             5          6           7
              8       9      10    11   12   13     14   15
        
        You will use this tree to test your methods
         */
        root = createNodes(1);

    }

    private BinaryTreeNode createNodes(int val) {
        //Base case: stop making nodes at 15 total nodes
        if (val > 15) {
            return null;
        }

        //Create the new node
        BinaryTreeNode curr = new BinaryTreeNode(val);

        //Create the left node
        curr.left = createNodes(val * 2);
        curr.right = createNodes(val * 2 + 1);

        return curr;
    }

    //The public method used to call the recursive traversal method
    public void preorderPrint() {
        if (root != null)
            
            
            preorderRec(root);
        
    }


    //The recursive method that does the actual traversal
    private void preorderRec(BinaryTreeNode node) {
         
   if(node !=  null) {  
      System.out.printf("%d ",node.data);  
      preorderRec(node.left);  
      preorderRec(node.right);  

         }
  }  

        
    

    //The public method used to call the recursive traversal method
    public void inorderPrint() {
    if (root != null)
            
            
            inorderRec(root);
        
    }

    

    //The recursive method that does the actual traversal
    private void inorderRec(BinaryTreeNode node) {
         if(node !=  null) {  
   inorderRec(node.left);  
   System.out.printf("%d ",node.data);  
   inorderRec(node.right);  
  }  

    }
    
    public void postorderPrint() {
    if (root != null)
            
            
            postorderRec(root);
        
    }
    
    private void postorderRec(BinaryTreeNode node) {
         if(node !=  null) {  
   postorderRec(node.left);  
   postorderRec(node.right);  
   System.out.printf("%d ",node.data);  

    }
    }

    //Use a queue to do a breadth first traversal searching for value
   // public boolean search(int value) {
   // }


}

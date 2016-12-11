//BinaryTreeTest.java
//Steve Browning
//Main class to test the assigned methods in BinaryTree

import java.util.*;

public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("PreOrder: ");
        bt.preorderPrint();
        System.out.println();
        System.out.println();
        System.out.println("InOrder: ");
        bt.inorderPrint();
        System.out.println();
        System.out.println();
        System.out.println("PostOrder: ");
        bt.postorderPrint(); 
        System.out.println();
        System.out.println();


    
        
        System.out.println("Please enter the number you would like to search the tree for: ");
        int input = scan.nextInt();
        
        System.out.println();
        
        bt.search(input);
        
        if (bt.search(input) == true){
                    System.out.println("YAY! Your value " + input + " is in the list");

        }
        else {
                    System.out.println("Oops! It doesn't look like " + input + " is in the list.");

        }
}
}

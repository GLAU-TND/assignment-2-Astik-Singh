/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree m = new MyBinarySearchTree();
        MyQueue q = new MyQueue();
        TreeNode root;

        root = new TreeNode(10);

        m.insert(root, 5);

        m.insert(root, 5);

        m.insert(root, 5);

        m.insert(root, 5);

        m.insert(root, 5);

        m.insert(root, 5);

        m.insert(root, 5);

        m.insert(root, 5);

        m.insert(root, 5);

        m.insert(root, 5);

        m.insert(root, 5);

        m.insert(root, 5);
        q.preOrder(root);
        q.queuePrint(q);
        System.out.print("Enter to find preOrder Successor : ");
        q.printSuccessor(sc.nextInt());
    }
}

package Searching;

import sun.awt.AWTAccessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BST {

    public static void main(String[] args) {
        Binary bst = new Binary();
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            int val = sc.nextInt();
            if(val==-1)
                break;
            al.add(val);
        }
        bst.add(al);
        Node n = bst.getNode();
//        if(bst.get(n,5))
//            System.out.println("Found");
//        else
//            System.out.println("Not Found");
        bst.inorder(n);
    }

}
class Binary{
    //driver
    private Node root = null;
    public void add(ArrayList<Integer> al){
        for(Integer i:al)
            root = insertNode(root,i);
    }
    public Node getNode(){
        return root;
    }
    public Node createNode(int value){
        Node node = new Node(value);
        return node;
    }
    public Node insertNode(Node node, int value){
        if(node==null)
            return createNode(value);
        else if(value<node.data)
            node.left = insertNode(node.left,value);
        else if(value>node.data)
            node.right = insertNode(node.right,value);
        return node;
    }
    public boolean get(Node node,int data){
        if(node==null)
            return false;
        else if(node.data == data)
            return true;

        else if(node.data<data)
            get(node.left,data);
        else if(node.data>data)
            get(node.right,data);
        else if(node.data != data && node.right ==null && node.left==null)
            return false;
        return true;
    }
    public void inorder(Node root){
        if(root!=null){
            inorder(root.right);
            System.out.println(root.data);
            inorder(root.left);
        }
    }
}
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

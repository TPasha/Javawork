/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_ds;

public class BinarySearchTree{
    public static void main(String[] args) {
        BinarySearchTree1 b=new BinarySearchTree1();
        b.insert(18);
        b.insert(16);
        b.insert(20);
        b.insert(15);
        b.insert(17);
        b.insert(19);
        b.insert(21);
        b.delete(16);
        System.out.println(b.Find(16));
        b.traverseInOrder(b.root);
    }
}


class Node{
   public int value;
   public Node left;
   public Node right;
   Node(int value){
        this.value=value;
        right=null;
        left=null;
   }
}

class BinarySearchTree1 {
     Node root;
    
    private Node insertNOdeUsingRecursive(Node n,int value){
        if(n==null){
            return new Node(value);
        }
        if(value<n.value){
            n.left=insertNOdeUsingRecursive(n.left,value);
        }
        else if(value>n.value){
            n.right=insertNOdeUsingRecursive(n.right,value);
        }
        else{
            return n;
        }
        return n;
    }
    
    public void insert(int value) {
    root =insertNOdeUsingRecursive (root, value);
    }
    
    
    
    private boolean FindNodeUsingRecursive(Node n,int value){
        if(n==null){
            return false;
        }
        if(value==n.value){
            return true;
        }
        if(value<n.value){
            return FindNodeUsingRecursive(n.left,value);
        }
        else{
            return FindNodeUsingRecursive(n.right,value);
        }
    }
    public boolean Find(int value){
        return FindNodeUsingRecursive(root,value);
    }
    
    private Node deleteNodeUsingRecursive(Node n,int value){
        if(n==null){
            return null;
            
        }
        if(value==n.value){
            if (n.left == null && n.right == null) {
               return null;
            }
            if (n.right == null) {
                return n.left;
            }

            if (n.left == null) {
                return n.right;
            }
        }
        
        if(value<n.value){
             n.left= deleteNodeUsingRecursive(n.left,value);
             return n;
        }
        
        n.right=deleteNodeUsingRecursive(n.right,value);
        return n;
    }
    public void delete(int value){
        root=deleteNodeUsingRecursive(root,value);
    }
    
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    
    }
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversepostOrder(Node node) {
        if (node != null) {
            traversePreOrder(node.left);
            traversePreOrder(node.right);
            System.out.print(" " + node.value);

        }
    }
}

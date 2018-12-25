/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_assignment_2;


public class Queue_with_linkedlist {
    public static void main(String[] args) {
          Slinklylist s=new Slinklylist();
          s.addfirst(10);
          s.addfirst(20);
          s.addlast(10);
          s.removeByValueFirst();
          s.display();
    }
}

class Node{
    private int data;
    private Node next;
    Node(int a,Node d){
        data=a;
        next=d;
    }
    
    public void setData(int d){
        data=d;
    }
    public int getData(){
        return data;    
    }
    
    public void setnext(Node n){
        next=n;
    }
    public Node getnext(){
        return next;
    }
}

class Slinklylist{
    private Node head;
    private Node tail;
    private int size;
    Slinklylist(){
        head=null;
        tail=null;
        size=0;
    }
    public void addfirst(int a){
        Node n=new Node(a,head);
        head=n;
        size++;
        if(tail==null){
            tail=n;
        }
    }
    public void addlast(int a){
        Node n=new Node(a,null);
        tail.setnext(n);
        tail=n;
        size++;
    }
    public void removeByValueFirst(){
        head=head.getnext();
    }
    public void removeByValueLast(){
        Node ptr=head;
        while(ptr.getnext()!=tail){
            ptr=ptr.getnext();
        }
        tail=ptr;
        ptr.setnext(null);
    }
    public void display(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.getData()+" ");
            ptr=ptr.getnext();
        }
        
    }
    
}
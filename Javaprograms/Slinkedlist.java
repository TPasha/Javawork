/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

public class Slinkedlist {
    public static void main(String[] args) {
        Singlylinkedlist s=new Singlylinkedlist();
        s.Addfirst(10);
        s.Addfirst(20);
        s.Addfirst(30);
        s.display();
    }
}
class Node{
    private int data;
    private Node next;
    public Node(int d,Node n){
        data=d;
        next=n;
    }
    public void setdata(int s){
        data=s;
    }
    public int getdata(){
        return data;
    }
    public void setnext(Node n){
        next=n;
    }
    public Node getnext(){
    return next;
    }
}
class Singlylinkedlist{
    private Node head;
    private int size;
    
    public Singlylinkedlist(){
        head=null;
        size=0;
    }
    public void Addfirst(int value){
        Node n=new Node(value,head);
        n.setnext(head);
        head=n;
        size++;
    }
    public void display(){
        Node ptr=head;
        while(ptr!=null){
            System.out.println(ptr.getdata());
            ptr=ptr.getnext();
        }
    }
    
}
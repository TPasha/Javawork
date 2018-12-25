package javaapplication5;


public class Linklist {
        public static void main(String[] args) {
              stack.Diplaystack();
           Slinklylist s=new Slinklylist();
           s.addfirst(10);
            s.addfirst(123);
             s.addfirst(34);
              s.addfirst(40);
               s.addfirst(50);
               s.addlast(123123);
               s.addfirst(00);
               s.addlast(898990);
               s.removefirst();
               s.removefirst();
               s.removelast();
               s.removelast();
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
    public void removefirst(){
        head=head.getnext();
    }
    public void removelast(){
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
class Stack1{
    Slinklylist s=new Slinklylist();
    
    public void push(int data){
        s.addfirst(data);
    }
    public void pop(){
        s.removefirst();
    }
    public void Diplaystack(){
        s.display();
    }
    
}
class Queue1{
    Slinklylist s1=new Slinklylist();
    
    public void Enqueue(int d){
        s1.addfirst(d);
    }
    public void Dequeue(){
        s1.removelast();
    }
    public void Displayqueue(){
        s1.display();
    }
}

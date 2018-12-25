package practice_datastructure;

public class Linkedlist1 {
    public static void main(String[] args) {
        
    Slinkedlist sc=new Slinkedlist();
    sc.addfirst(50);
    sc.addfirst(40);
    sc.addfirst(30);
    sc.addfirst(20);
    sc.addfirst(10);
    sc.addlast(99);
    sc.addfirst(1230);
    sc.addlast(423);
    sc.removelast();
    
    sc.removelast();
    sc.addlast(434);
    sc.removefirst();
    sc.display();
    }
}
class Node{
    private int data;
    private Node next;
    Node(int d,Node n){
        this.data=d;
        this.next=n;
    }
    public void setdata(int d){
        data=d;
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
class Slinkedlist{
    private Node head;
    private Node tail;
    private int size;
    Slinkedlist(){
        head=null;
        tail=null;
        size=0;
        
    }
    public void addfirst(int d){
        Node n=new Node(d,head);
        n.setnext(head);
        head=n;
        if(tail==null){
            tail=n;
        }
        size++;
    }
    public void addlast(int d){
        Node n=new Node(d,null);
        if(tail==null){
            head=tail=n;
        }
        else{
            n.setnext(tail.getnext());
            tail.setnext(n);
            tail=n;
        }
    }
    public void removefirst(){
        if(head!=null){
        head=head.getnext();
        }
    }
    public void removelast(){
        Node n=head;
        while(n.getnext()!=tail){
            n=n.getnext();
        }
        tail=n;
        n.setnext(null);
    }
    public void display(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.getdata()+" ");
            ptr=ptr.getnext();
            
        }
    }
}
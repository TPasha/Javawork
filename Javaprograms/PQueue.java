/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_datastructure;

public class PQueue {
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        System.out.println("deleted item is : "+q.Dequeue());
        
        System.out.println("deleted item is : "+q.Dequeue());
        
        System.out.println("deleted item is : "+q.Dequeue());
        
    }
}
class Queue{
    private int[] arr;
    private int front;
    private int rear;
    
    Queue(int size){    
          arr=new int[size];
          front=0;
          rear=0;
    }
    public void Enqueue(int a){
        if(arr.length==rear){
            System.out.println("Queue is full");
        }
        else{
            System.out.println(a+" is added at index "+rear);
            arr[rear]=a;
            rear++;
        }
    }
    public int Dequeue(){
        if(front>=arr.length){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            return arr[front++];
        }
    }
}

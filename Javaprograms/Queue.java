package datastructure;

public class Queue {
    public static void main(String[] args) {
        Myqueue mq=new Myqueue(5);
        mq.Enqueue(90);
        mq.Enqueue(80);
        mq.Enqueue(70);
        mq.Enqueue(60);
        mq.Enqueue(50);
        mq.Enqueue(90);
        System.out.println(mq.Dequeue()+" is deleted");
        System.out.println(mq.Dequeue()+" is deleted");
        System.out.println(mq.Dequeue()+" is deleted");
        System.out.println(mq.Dequeue()+" is deleted");
        System.out.println(mq.Dequeue()+" is deleted");
        System.out.println(mq.Dequeue()+" is deleted");

    }
}

class Myqueue{
    private int[] arr;
    private int front;
    private int rear;
    int b;
    public Myqueue(int size){
        arr=new int[size];
        b=size;
        rear=-1;
        front=-1;
    }
    public void Enqueue(int a){
        front++;
        if(front>=b){
            System.out.println("Queue is Full");
            
        }
        else{
            arr[front]=a;
            System.out.println(a +" is added at index "+front);
        }
    }
    public int Dequeue(){
        rear++;
        if(rear>=b){
            System.out.println("queue is Empty");
            return -1;
        }
        else{
            return arr[rear];
        }
        
    }
}

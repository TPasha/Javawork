package practice_datastructure;
public class Practice_datastructure {

    public static void main(String[] args) {
        Stack sc=new Stack(5);
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);
        sc.push(50);
        sc.push(60);
        sc.push(60);
        System.out.println("deleted item is : "+sc.pop());
        System.out.println("deleted item is : "+sc.pop());
        sc.push(99);
        System.out.println("deleted item is : "+sc.pop());
        sc.push(99);
    

    }
    
}

class Stack{
    private int[] arra;
    private int top;
    Stack(int size){
        arra=new int[size];
        top=0;
    }   
    public void push(int a){
        if(arra.length==top){
            System.out.println("Stack is Full");
        }
        else{
            arra[top]=a;
            System.out.println(a+" is added at index "+top);
            top++;
        }
    }
    public int pop(){
//        System.out.println(top);
        if(top<=0){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
        return arra[--top];
        }
        }
    

}

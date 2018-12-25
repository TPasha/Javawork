/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;


public class Stack {
    public static void main(String[] args) {
        Mystack ms=new Mystack(5);
        ms.push(10);
        ms.push(20);
        ms.push(30);
        ms.push(40);
        ms.push(50);
        ms.push(60);
        System.out.println("POP 1 "+ms.pop());
        System.out.println("POP 2 "+ms.pop());
        System.out.println("POP 3 "+ms.pop());
        System.out.println("POP 4 "+ms.pop());
        System.out.println("POP 5 "+ms.pop());
        System.out.println("POP 1 "+ms.pop());


        
    }
}
class Mystack{
    private int[] arr;
    private int top;
    private int over;
    
    public Mystack(int size){
        arr=new int[size];
        this.over=size-1;
        top=-1;
    }
    
    public void push(int a){
        if(over==top){
            System.out.println("Stack overflow");
        }
        else{
        top++;
        arr[top]=a;
            System.out.println(a+ " is added in stack at index "+top);
        }
    }
    public int pop(){
        if(top>-1){
        int b=arr[top];
        top--;
        return b;
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

}
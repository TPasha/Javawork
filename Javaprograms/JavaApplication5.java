/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Noman
 */
public class JavaApplication5 {
    public static void main(String[] args) {
        Stack sc=new Stack(6);
        sc.push(10);
          sc.push(20);
            sc.push(30);
              sc.push(40);
                sc.push(50);
        System.out.println("deleted item is :"+sc.pop());
        
        System.out.println("deleted item is :"+sc.pop());
        
        System.out.println("deleted item is :"+sc.pop());
        
        System.out.println("deleted item is :"+sc.pop());
        
        System.out.println("deleted item is :"+sc.pop());
        
        System.out.println("deleted item is :"+sc.pop());
        
    }
    
}

class Stack{
    private int[] arr;
    private int top;
    Stack(int size){
        arr=new int[size];
        top=0;
    }
    public void push(int a){
        if(arr.length==top){
            System.out.println("Stack is full");
        }
        else{
        arr[top]=a;
        System.out.println(a+" is added at index "+top);
        top++;
        }
    }
    public int pop(){
        if(top<=0){
            System.out.println("stack is empty");
            return -1;
        }
        else{
            top--;
            return arr[top];
        }
   }
    
}
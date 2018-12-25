/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_datastructure;

/**
 *
 * @author Noman
 */
public class Fibon_recursion {
    public static void main(String[] args) {
        Fibon_recursion f=new Fibon_recursion();
        for(int i=1;i<=7;i++){
            System.out.println(f.fib(i));
        }
    }
    public int fib(int n){
        if(n==1 || n==2){
            return 1;
        }
        return (fib(n-1)+fib(n-2));
        
    }
}

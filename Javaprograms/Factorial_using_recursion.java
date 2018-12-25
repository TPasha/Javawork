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
public class Factorial_using_recursion {
    public static void main(String[] args) {
        Factorial_using_recursion f=new Factorial_using_recursion();
        System.out.println(f.fac(7));
    }
    public int fac(int a){
        if(a==1){
            return 1;
        }
        else{
            return fac(a-1)*a;
        }
    }
}

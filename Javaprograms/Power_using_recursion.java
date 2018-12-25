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
public class Power_using_recursion {
    public static void main(String[] args) {
        Power_using_recursion p=new Power_using_recursion();
        System.out.println(p.pow(3, 3));
    }
    public int pow(int a,int b){
        if(b==0){
            return 1;
        }
        else{
            return pow(a,b-1)*a;
        }
        
    }
    
}

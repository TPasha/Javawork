/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_datastructure;
import java.util.Stack;
/**
 *
 * @author Noman
 */
public class Built_in_stack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.push(40);
        s.push(50);
        s.pop();
        s.push(530);
        
        s.push(90);
        s.push(120);
        System.out.println("Search : "+s.search(120));
        System.out.println(s.peek());
        System.out.println("Size "+s.size());
        System.out.println(s.empty());
        for(Integer x:s){
            System.out.println(x);
        }
    }
}

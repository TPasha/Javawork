/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_datastructure;
import java.util.Vector;
/**
 *
 * @author Noman
 */
public class Vector_list {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>();
        System.out.println("Capacity of default v: "+ v.capacity());
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        v.add(70);
        v.add(80);
        v.add(90);
        v.add(100);
        v.add(100);
        v.trimToSize();
        System.out.println("Capacity of default v: "+ v.capacity());
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;
import java.util.Vector;
import java.util.ArrayList;

public class Vectorlist {
    public static void main(String[] args) {
          Vector<String> vec = new Vector<String>(4);  
          //Adding elements to a vector  
          vec.add("Tiger");  
          vec.add("Lion");  
          vec.add("Dog");  
          vec.add("Elephant");  
          //Check size and capacity  
         
        
        for(String x:vec){
            System.out.println(x);
        }
          System.out.println("_________________________");
          System.out.println("Size is: "+vec.size());  
          System.out.println("Default capacity is: "+vec.capacity()); 
          System.out.println("Vector element is: "+vec);  
          vec.addElement("Rat");  
          vec.addElement("Cat");  
          vec.addElement("Deer");  
          //Again check size and capacity after two insertions  
          System.out.println("Size after addition: "+vec.size());  
          System.out.println("Capacity after addition is: "+vec.capacity());  
          System.out.println("Vector element is: "+vec);  
          vec.remove("Lion");
          vec.remove(88);
          System.out.println("Vector element is: "+vec);  


    }
}

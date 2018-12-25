/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_datastructure;
import java.util.Hashtable;
/**
 *
 * @author Noman
 */
public class Built_inhashtable {
    public static void main(String[] args) {
        Hashtable<String,Integer> h=new Hashtable<String,Integer>(10);
        Hashtable<String,Integer> h1=new Hashtable<String,Integer>();
        h.put("noman",120);
        h.put("asd",220);
        h.put("qweqwn",320);
        h.put("qweqwn1",320);
//        h.clear();
        h1=(Hashtable)h.clone();
        System.out.println(h);
        System.out.println(h1);
        System.out.println(h.contains(120));
        System.out.println(h.containsKey("asd"));
        System.out.println(h.containsValue(120));
        System.out.println(h.elements());
        System.out.println("Get "+h.get("asd"));
        System.out.println(h.keys());
        System.out.println("Size : "+h.size());
        h.remove("asd");
        System.out.println(h);
        
    }
}

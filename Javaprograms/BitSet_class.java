/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_datastructure;
import java.util.BitSet;
/**
 *
 * @author Noman
 */
public class BitSet_class {
    public static void main(String[] args) {
        BitSet b1=new BitSet();
        BitSet b2=new BitSet();
        b1.set(1);
        b1.set(2);
        b1.set(3);
        b1.set(4);
        b2.set(1);
        b2.set(9);
        b2.set(23);
        b2.set(4);
        System.out.println(b1);
        System.out.println(b2);
        b1.xor(b2);
//        b1.and(b2);
//        b1.or(b2);
//        b1.andNot(b2);
        System.out.println(b1);
                }
}

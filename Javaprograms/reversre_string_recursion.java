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
public class reversre_string_recursion {
    public static void main(String[] args) {
        reversre_string_recursion s=new reversre_string_recursion();
        System.out.println(s.reverse("i am noman"));
    }
    public String reverse(String str){
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }
}

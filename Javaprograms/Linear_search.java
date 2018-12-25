/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_datastructure;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr;
        System.out.println("Enter the length of an array :");
        int len=sc.nextInt();
        System.out.println("Enter "+len+ " numbers");
        arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        System.out.println("Enter number u want to search");
        int search=sc.nextInt();
        for(int i=0;i<len;i++){
            if(search==arr[i]){
                System.out.println("Found");
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Not found");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oslab;

import java.util.Scanner;

/**
 *
 * @author Noman
 */
public class MVT {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int ms,i=0,temp=0,n=0;
        int ef;
        int[] mp =new int[10];
        String str;
        char c='y';
        System.out.println("Enter Memory size in bytes : ");
        ms=sc.nextInt();
//        for(i=0;c=='y';i++,n++){
//            
//        }
        
        while(c=='y'){
            System.out.println("Enter memory required for P"+i);
            mp[i]=sc.nextInt();
            temp=temp+mp[i];
            if(temp<=ms){
                System.out.println("Memory is allocated for P"+i);
                n++;
                System.out.println("Do you want to continue (Y/N) : ");
                str=sc.next();
                c=str.charAt(0);
                
            }
            else{
                System.out.println("Memory is full");
                temp=temp-mp[i];
                System.out.println(temp);
                break;
            }
            i++;
            
        }
        System.out.println("Total memory : "+ms);
        System.out.println("Allocated memory : "+temp);
        ef=ms-temp;
        System.out.println("External fragmentation : "+ef);
        System.out.println("\n\n\n");
        System.out.println("Process\t\tMemory allocated");
        for(i=0;i<n;i++){
              System.out.println("P"+i+"\t\t"+mp[i]);
        }
        
        
    }
}

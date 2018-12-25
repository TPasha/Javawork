/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oslab;

import java.util.Scanner;
public class MFT_Equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ms,bs,n,ef,nob,p=0;
        int i;
        int[] mp=new int[10];
        int totalfrag=0;
        System.out.println("Enter total memory in bytes : ");
        ms=sc.nextInt();
        System.out.println("Enter Block size in bytes :");
        bs=sc.nextInt();
        System.out.println("Enter number of process u want to run : ");
        n=sc.nextInt();
        for( i=0;i<n;i++){
            System.out.println("Enter memory required for P"+i);
            mp[i]=sc.nextInt();
        }
        nob=ms/bs;
        ef=ms-(nob*bs);
        System.out.println("Blocks available in memory : "+nob);
        System.out.println("\n\n");
        System.out.println("Process\tMemory Required\tAllocated\tinternal f");
        for( i=0;i<n;i++){
            if(p<nob){
                System.out.print("P"+i+"\t"+mp[i]+"\t\t");
                if(mp[i]>bs){
                    System.out.println("NO\t\t---");
                }
                else{
                    int frag=bs-mp[i];
                    totalfrag=totalfrag+frag;
                    System.out.print("YES\t\t"+frag);
                    p++;
                }
                System.out.println("");
            }
            else{
                System.out.println("Memory is Full, Remaining Processes cannot be accomodated");
            }
            
        }
        System.out.println("Total internal fragmentation is : "+totalfrag);
        System.out.println("Total external fragmentation is : "+ef);
    }
}


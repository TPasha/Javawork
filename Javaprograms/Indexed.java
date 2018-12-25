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
public class Indexed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        String[] file_names=new String[10];
        int[] nob=new int[10];
        int[][] bof=new int[10][30];
        System.out.println("Enter no files : ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Enter name of File "+(i+1)+" : ");
            file_names[i]=sc.next();
            System.out.println("Enter no of blocks of in file "+(i+1)+" : ");
            nob[i]=sc.nextInt();
            System.out.println("Enter blocks of file "+(i+1)+" : ");
            for(int j=0;j<nob[i];j++){
                bof[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the file to be seacrhed : ");
        String search=sc.next();
        boolean flag=false;
        for(i=0;i<n;i++){
               if(search.equals(file_names[i])){
                   System.out.println("File name\tNo of blocks\tBlocks occupied");
                   System.out.print(file_names[i]+"\t\t"+nob[i]+"\t\t");
                   for(int j=0;j<nob[i];j++){
                       System.out.print(bof[i][j]+" | ");
                   }
                   flag=true;
               }
        }
        if(flag==false){
            System.out.println("Name does not found");
        }
        
                
    }
}

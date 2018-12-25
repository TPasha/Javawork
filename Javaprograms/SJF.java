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
public class SJF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] bt=new int[20];
        int[] p=new int[20];
        int[] wt=new int[20];
        int[] tat=new int[20];
        int i,j;
        int n;
        int temp;
        double wtavg;
        double tatavg;
        System.out.println("Enter number of process u want to run");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Enter burst time for P"+i);
            bt[i]=sc.nextInt();
            p[i]=i;
        }
        for(i=0;i<n;i++){
               for(j=i+1;j<n;j++){
                   if(bt[i]>bt[j]){
                        temp=bt[i];
                        bt[i]=bt[j];
                        bt[j]=temp;
                        
                        temp=p[i];
                        p[i]=p[j];
                        p[j]=temp;
                                
                   }
               }
        }
        wt[0]=0;
        wtavg=0;
        tat[0]=bt[0];
        tatavg=bt[0];
        for(i=1;i<n;i++){
            wt[i]=wt[i-1]+bt[i-1];
            tat[i]=tat[i-1]+bt[i];
            wtavg=wtavg+wt[i];
            tatavg=tatavg+tat[i];
        }
        System.out.println("Process\tBurst Time\tWaiting Time\tTurnAround Time");
        for(i=0;i<n;i++){
            System.out.println("p"+i+"\t"+bt[i]+"\t\t"+wt[i]+"\t\t"+tat[i]);
        }
        System.out.println("Average Waiting time is : "+wtavg/n);
        System.out.println("Average Turn around time is : "+tatavg/n);     
       }   
}

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
public class Priority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,temp;
         int[] bt=new int[20];
        int[] wt=new int[20];
        int[] tat=new int[20];
         int[] pri=new int[20];
         int[] p=new int[20];
         double wtavg;
         double tatavg;
         System.out.println("Enter number of process : ");
         n=sc.nextInt();
         for(i=0;i<n;i++){
                p[i]=i;
               System.out.println("Enter burst time of P"+i);
               bt[i]=sc.nextInt();
               System.out.println("Enter Prioirty of P"+i);
               pri[i]=sc.nextInt();
         }
         for(i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                 if(pri[i]>pri[j]){
                    temp=pri[i];
                    pri[i]=pri[j];
                    pri[j]=temp;
                    
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
         System.out.println("Process\tPriority\tBursttime\tWaitingtime\tTurnaroundtime");
         for(i=0;i<n;i++){
             System.out.println("P"+i+"\t\t"+pri[i]+"\t\t"+bt[i]+"\t\t"+wt[i]+"\t\t"+tat[i]);
         }
         System.out.println("\n\nAverage Waiting time : "+wtavg/n);
         System.out.println("Average TurnAround time is : "+tatavg/n);
    }
}

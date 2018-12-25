/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_datastructure;

import java.util.Scanner;

public class Largest_no {
		public static void main(String args[]) {
			int[] arra=new int[6];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 6 numbers :");
			for(int i=0;i<arra.length;i++) {
				arra[i]=sc.nextInt();
			}
			int largest=0;
			int count=0;
			for(int i=0;i<arra.length;i++) {
				if(largest<arra[i]) {
					largest=arra[i];
				}
				if(i==arra.length-1) {
					for(int j=0;j<arra.length;j++) {
						if(largest==arra[j]) {
							count++;
						}
						
					}
				}
			}
			System.out.println("Largest Number is "+largest+" and its occurence  count is "+count);
			
		}
}

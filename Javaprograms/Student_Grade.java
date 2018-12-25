/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_datastructure;

import java.util.Scanner;


public class Student_Grade {
        public static void main(String args[]) {
        
                        Scanner sc=new Scanner(System.in);
			System.out.println("*****************Welcome to student Grades*****************");
			System.out.println();
			System.out.println("Enter 1 if u want to see grades directly and if u want to enter answer key by yourself then enter 2");
			int m=sc.nextInt();
			if(m==1) {
				char[][] student= {
						{'A','B','A','C','C','D','E','E','A','D'},
						{'D','B','A','B','C','A','E','E','A','D'},
						{'E','D','D','A','C','B','E','E','A','D'},
						{'C','B','A','E','D','C','E','E','A','D'},
						{'A','B','D','C','C','D','E','E','A','D'},
						{'B','B','E','C','C','D','E','E','A','D'},
						{'B','B','A','C','C','D','E','E','A','D'},
						{'E','B','E','C','C','D','E','E','A','D'}
				};
				char[] key= {'D','B','D','C','C','D','A','E','A','D'};
				int count=0;
				for(int i=0;i<student.length;i++) {
					count=0;
					for(int j=0;j<10;j++) {
						if(key[j]==student[i][j]) {
							count++;
						}
					}
					System.out.println("Student "+(i+1)+" correct answers are :"+count);
				}
				
			}
			else if(m==2) {
				char[][] student1=new char[8][10];
				char[] key1= {'D','B','D','C','C','D','A','E','A','D'};
				for(int i=0;i<student1.length;i++) {
					System.out.println("Enter the answer keys of student "+(i+1)+":");
					for(int j=0;j<10;j++) {
						System.out.println("Question "+(j+1)+":");
						student1[i][j]=sc.next().charAt(0);
						
					}
				}
				int count=0;
				for(int i=0;i<student1.length;i++) {
					count=0;
					for(int j=0;j<10;j++) {
						if(key1[j]==student1[i][j]) {
							count++;
						}
					}
					System.out.println("Student "+(i+1)+" correct answers are :"+count);
				}
			}
			else {
				System.out.println("Invalid input .....Please enter 1 or 2");
			}
		}    
}

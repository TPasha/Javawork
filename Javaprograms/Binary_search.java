package practice_datastructure;

import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{-1,0,1,2,9,12,55,28};
        System.out.println("Enter a number u want to search");
        int search=sc.nextInt();
        int start=0;
        int end=arr.length-1;
        int mid;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            mid=(start+end)/2;
            if(arr[mid]<search){
                start=mid;
            }
            else if(arr[mid]>search){
                end=mid;
            }
            else if(arr[mid]==search){
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("Value not found");
        }
        else{
            
                System.out.println("Value found");
        }
    }
}

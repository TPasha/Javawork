
package oslab;
import java.util.Scanner;
public class Sequential {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,temp;
        String[] file_names=new String[10];
        int[] start_block=new int[10];
        int[] no_blocks=new int[10];
        System.out.println("Enter no of files : ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Enter file "+(i+1)+" name : ");
            file_names[i]=sc.next();
            System.out.println("Enter Starting block of file "+(i+1)+" : ");
            start_block[i]=sc.nextInt();
            System.out.println("Enter no of blocks in file "+(i+1)+" : ");
            no_blocks[i]=sc.nextInt();
        }
        System.out.println("Enter the file u want to search");
        String search=sc.next();
        boolean flag=false;
        for(i=0;i<n;i++){
            if(search.equals(file_names[i])){
                System.out.println("File name\tStart Block\tNo.of blocks occupied");
                System.out.print(file_names[i]+"\t\t"+start_block[i]+"\t\t");
                for(int j=0;j<no_blocks[i];j++){
                    int inc=start_block[i]+j;
                    System.out.print(inc+" | ");
                    
                }   
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("name not found");
        }
    }
   
    
}

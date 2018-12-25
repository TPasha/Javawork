package datastructure;
import java.util.ArrayList;

public class MyArraylist {   
    public static void main(String[] args) {
//        Student s1=new Student(123,"noman",21);
//        Student s2=new Student(456,"ahmed",22);
//        Student s3=new Student(789,"khan",45);
//        ArrayList<Student> a=new ArrayList<Student>();
//        ArrayList<Integer> a1=new ArrayList<Integer>();
//        a.add(s1);
//        a.add(s2);
//        a.add(s3);
//        a1.add(10);
//        a1.add(20);
//        for(Student x:a){
//            System.out.println(x.roll+"  "+x.name+" "+x.age );
//}
         ArrayList<Integer> a=new ArrayList<Integer>(4);
         ArrayList<Integer> a1=new ArrayList<Integer>();
         a.add(10);
         a.add(20);
         a.add(30);
         a1.add(99);
         a1.add(88);
         a1.add(66);

         a.addAll(a1);
         a.remove(0);

         System.out.println("size : "+ a.size());

          for(Integer x:a){
            System.out.print(x+" ");
          }
    }
}

class Student{
    int roll;
    String name;
    int age;
    Student(int roll,String name,int age){
        this.roll=roll;
        this.name=name;
        this.age=age;
 
    }
}
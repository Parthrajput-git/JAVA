import java.util.*;
public class Constructor{
    public static void main(String args[]){
     Student sc=new Student("Rajput  :");
     Student sc1=new Student(123);
    }
}
class Student{
    String name;
    int roll;
    Student(String name){
        this.name=name;
        System.out.println("Contructor calling  :");
       System.out.println(name); 
    }
    Student(int roll){
        this.roll=roll;
        System.out.println(roll);
    }
}
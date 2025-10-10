import java.util.*;
public class Copycon{
    public static void main(String args[]){
      Student sc=new Student();
      sc.name="Shradha";
      sc.roll=123;
      sc.password="abcd";
      Student s1=new Student(sc);
    }
}
class Student{
    String name;
    int roll;
    String password;
    Student(){
     System.out.println("Constructor calling  :");
    }
    Student(Student sc){
     this.name=sc.name;
     this.roll=sc.roll; 
    }
    
}
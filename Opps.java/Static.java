import java.util.*;
public class Static{
    public static void main(String args[]){
    Student sc=new Student();
    sc.name="Jvm";
    sc.get();
    //System.out.println(sc.name);
    Student sc2=new Student();
    sc2.schoolname="BSM";
    System.out.println(sc2.schoolname);
    }
}
class Student{
    int roll;
    String name;
    static String schoolname;
    void set(String name){
        this.name=name;
    }
    String get(){
        return this.name;
    }
}
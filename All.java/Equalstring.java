import java.util.*;
public class Equalstring{
    public static void main(String srgs[]){
        String a="java";
        String b="java";
        String c=new String("java");
        if(a==b){
            System.out.println("String are equal  :");
        }
        else{
            System.out.println("String are not equal  :");
        }
        if(a.equals(c)){
            System.out.print("String are equal  :");
        }
        else{
            System.out.println("String are not eqaul  :");
        }
    }
}
import java.util.*;
public class String1{
    public static void print(String str){
        for(int i=0;i<str.length();i++){
System.out.print(str.charAt(i));
        }
    }
    public static void main(String args[]){
        // char arr[]={'r','a','m'};
        // String arr1="hello";
        // System.out.println("String arr  :"+arr1.length());
        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.print("Your String  :"+name);
        String firstname="Parth";
        String lastname="Rajput";
        String print=firstname+" "+lastname;
        System.out.println("My name is  :"+print);
        System.out.println(firstname.charAt(4)+(":==Index"));
        print(firstname);
    }
    }

import java.util.*;
public class Decreasing{
public static void print(int n){
    if(n==0){
        return;
    }
//    print(n-1);
    System.out.print(n+" ");
     print(n-1);
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your positive number  :=");
    int n=sc.nextInt(); 
print(n);
}
}
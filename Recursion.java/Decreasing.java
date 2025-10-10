import java.util.*;
public class Decreasing{
       public static void printdec(int n){
    if(n==1){
        System.out.println(1);
        return;
    }
    System.out.print(n+" ");
    printdec(n-1);
    }
    public static void main(String args[]){
    // int n=10;
     Scanner sc=new Scanner(System.in);
    System.out.print("Enter your number  :");
    int n=sc.nextInt();
    printdec(n);
    }
}
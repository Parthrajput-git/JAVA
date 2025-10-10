import java.util.*;
public class Fibonacci{
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fmn1=fibonacci(n-1);
        int fmn2=fibonacci(n-2);
        int fmn=fmn1+fmn2;
        return fmn;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Fibonacci series  :");
        int n=sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
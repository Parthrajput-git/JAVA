import java.util.*;
public class Fibonacci{
    public static int fibo(int n){
     if(n==0  || n==1){
        return n;
     }
     int fi1=fibo(n-1);
     int fi2=fibo(n-2); 
     int fi=fi1+fi2;
     return fi;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number  :");
        int n=sc.nextInt();
        System.out.print(fibo(n));
    }
}
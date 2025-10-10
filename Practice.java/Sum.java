import java.util.*;
public class Sum{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int op=n+sum(n-1);
        return op;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter your natural number  :");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
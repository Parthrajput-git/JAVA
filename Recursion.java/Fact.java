import java.util.*;
public class Fact{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
       // int fnf=(n-1);
        int fn=n*fact(n-1);
      //  System.out.print(n+" ");
        return fn;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number  :");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
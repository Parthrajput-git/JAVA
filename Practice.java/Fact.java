// Fact. Oparation.
import java.util.*;
public class Fact{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int f=n*fact(n-1);
        return f;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your positive number  :");    
    int n=sc.nextInt();
    System.out.println(fact(n));
    }
}

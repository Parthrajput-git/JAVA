import java.util.*;
public class Natural{
    public static int sum(int n){
        if(n==1){
        return 1;
    }
    int sum=n+sum(n-1);
    return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter yuor natural number  :");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
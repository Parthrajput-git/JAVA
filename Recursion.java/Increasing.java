import java.util.*;
public class Increasing{
    public static void printInc(int n){
    if(n==1){
        System.out.print(1);
        return;
    }
    printInc(n-1);
    System.out.print(n+" ");
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number  :");
        int n=sc.nextInt();
        printInc(n);
    }
}
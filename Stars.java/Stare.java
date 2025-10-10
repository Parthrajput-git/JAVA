import java.util.Scanner;
public class Stare{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number  :");
        int i,j;
        int n=sc.nextInt();
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class Age{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        //int b=sc.nextInt()
        if(a>=18){
            System.out.println("The available for voting  :");
        }
        else{
            System.out.println("Not available for voting  :");
        }
    }
}

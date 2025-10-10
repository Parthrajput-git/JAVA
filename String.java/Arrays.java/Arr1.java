import java.util.Scanner;
public class Arr1{
    public static void main(String args[]){
    int mark[]=new int [100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks  :");
mark[0]=sc.nextInt();
mark[1]=sc.nextInt();
mark[2]=sc.nextInt();
System.out.println("Maths   :="+mark[0]);
System.out.println("Chem  :="+mark[1]);
System.out.println("Phy  :="+mark[2]);
int sum=(mark[0]+mark[1]+mark[2])/3;
System.out.println("Paracentage "+sum+"%");
System.out.print("Length is "+mark.length);
   }
}
import java.util.*;
public class Tilling{
    public static int oparation(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=oparation(n-1);
        int fnm2=oparation(n-2);
        int totalways=fnm1+fnm2;
        return totalways;
    }
    public static void main(String args[]){
     System.out.println(oparation(4));
    }
}
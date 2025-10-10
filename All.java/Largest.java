import java.util.*;
public class Largest{
    public static int largest(int n[]){
int larg=Integer.MIN_VALUE;
for(int i=0;i<=n.length;i++){
    if(larg<=n[i]){
        larg=n[i];
    }
}
return larg;
    }
    public static void main(String args[]){
        int n[]={2,6,5,};
        System.out.print("Largest value  :"+largest(n));
    }
}
import java.util.*;
public class Shorted{
    public static boolean shorted(int short[],int i){
        if(i==short.length-1){
            return true;
        }
        if(short[i]>short(i+1)){
            return false;
        }
        return shorted(short,i+1);
    }
    public static void main(String args[]){
     int short[]={1,2,3,4};
       System.out.println(shorted(short,0));
    }
}
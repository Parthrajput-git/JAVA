import java.util.*;
public class Short{
    public static boolean short(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return  short(arr,i+1);
    }
    public static void main(String args[]){
     int arr[]={2,4,5,6};
     System.out.println(short(arr,0));
    }
}
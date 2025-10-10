import java.util.*;
public class Occurence1{
    public static int printarr(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return printarr(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,7,5,9,3,7,5};
        System.out.println(printarr(arr,7,0));
    }
}
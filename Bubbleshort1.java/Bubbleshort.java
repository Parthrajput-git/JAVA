import java.util.*;
public class Bubbleshort{
    public static void prin(int arr[]){
        for(int turn=0;turn<arr.length;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printbubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
        public static void main(String args[]){
        int arr[]={5,4,3,2,1};
       prin(arr);
       printbubble(arr);
    }
}
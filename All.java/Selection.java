import java.util.*;
public Selection{
    public static void prin(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int minpos=turn;
            for(j=turn+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
                
            }
            int tepm=arr[minpos];
            
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
    }
}
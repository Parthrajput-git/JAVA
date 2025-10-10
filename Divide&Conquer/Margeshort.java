import java.util.*;
public class Margeshort{
    public static void print(int arr[]){
    for(int i=0;i<=arr.length;i++){
        System.out.println(arr[i]+" ");
    }
    System.out.println();
    }
    public static void margeshort(int arr,int si,int ei){
        if(si>=ei){
            return;
        }
     int mid=si+(ei-si)/2;
     margeshort(arr,si,mid);
     margeshort(arr,si,ei);
     marge(arr,si,mid,ei);
    }
    public static void marge(int arr,int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while( i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k++]=arr[i++];
        }
        while(j<=ei){
            arr[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++)
        arr[i]=arr[k];
    }
    public static void main(String args[]){
     int arr[]={6,3,9,5,2,8};
     margeshort(arr,0,arr.length-1);
     print(arr);
    }
}
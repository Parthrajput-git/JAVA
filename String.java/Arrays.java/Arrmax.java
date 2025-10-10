import java.util.Scanner;
public class Arrmax{
    public static void print(int number[]){
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int star=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                for(int k=star;k<=end;k++){
              cursum+=number[k];
                }
                System.out.println(cursum);
                if(maxsum<cursum){
                    maxsum=cursum;
                }
            }
        }
        System.out.print("Max is number  :"+maxsum);
    }
    public static void main(String args[]){
int number[]={2,4,6,8,10};
print(number);
    }
}
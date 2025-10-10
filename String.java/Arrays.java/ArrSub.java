public class Arrsub{
public static void print(int number[]){
    int tp=0;
    for(int i=0;i<number.length;i++){
        int star=i;
        for(int j=i;j<number.length;j++){
      int end=j;
      for(int k=star;k<=end;k++){
        System.out.print(number[k]+" ");
        tp++;
      }
       System.out.println();
        }
 System.out.println();
    }
    System.out.println("Total number of subarr  :"+tp);
}
public static void main(String args[]){
int number[]={2,4,6,8,10};
print(number);
}
}
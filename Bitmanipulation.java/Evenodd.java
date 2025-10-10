import java.util.*;
public class Evenodd{
    public static int getithbit(int n,int i){
       int bitMack=1<<i;
if((n&bitMack)==0){
    System.out.print("Value of i is  : ");
    return 0;
}
else{
    System.out.print("Value of i is  : ");
    return 1;
}
    }
public static void oparpation(int n){
    int bitMack=1;
    if((n&bitMack)==0){
        System.out.println("Even number  :");
    }
    else{
        System.out.println("Odd number  :");
    }
}
public static int setithbit(int n,int i){
    int bitMack=1<<i;
    return n|bitMack;
}
public static void main(String args[]){
// oparpation(3);
// oparpation(13);
// oparpation(14);
// System.out.println(getithbit(15,2));
// System.out.println(setithbit(10,2));
System.out.println(getithbit(15,2));
}
}
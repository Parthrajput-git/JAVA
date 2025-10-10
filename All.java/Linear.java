public class Linear{
public static int linear(int n[],int key){
    for(int i=0;i<n.length;i++){
        if(n[i]==key){
            return i;
        }
    }
return -1;
}
public static void main(String args[]){
int n[]={2,4,5,7,9,10};
int key=10;
int stor=linear(n,key);
if(stor==-1){
    System.out.print("Not fount");
}
else{
    System.out.print("Number is right  :"+stor);
}
}
}
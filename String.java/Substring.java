import java.util.*;
public class Substring{
    public static String(String str,int st,int en){
        String substr = "";
        for(int i=st;i<en;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="Hello Java";
        System.out.println(substring(str,0,7));
    }
}
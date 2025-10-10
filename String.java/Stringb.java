import java.util.*;
public class Stringb{
    public static void main(String args[]){
        Stringbuilder sp = new Stringbuilder("");
        for(char ch='a';ch<='z';ch++){
            sp.append(ch);
        }
        System.out.println(sp);
    }
}
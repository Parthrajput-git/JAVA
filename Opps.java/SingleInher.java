import java.util.*;
public class SingleInher{
    public static void main(String args[]){
    Thar sc=new Thar();  
    sc.virsion();  
    sc.name();
    sc.name="Priya";
    System.out.println(sc.name);
    }
}
class Car{
    String name;
    String color;
    int price;
    void name(){
        System.out.println(":  RRR  :");
    }
}
class Thar extends Car{
int model;
void virsion(){
    System.out.println("@2025.55");
}
}
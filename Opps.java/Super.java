import java.util.*;
public class Super{
   public static void main(String args[]){
   Dog sc=new Dog();
   System.out.println(sc.color);
   }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constractor called  :");
        
    }
}
class Dog extends Animal{
            Dog(){
         super.color="Brown";
        System.out.println("Dog constractor called  :");
    }
}
import java.util.*;
public class Abstract{
    public static void main(String args[]){
    Dog sc=new Dog();
    sc.print();
    sc.walk();
    Chiken cs=new Chiken();
    cs.print();
    cs.walk();
    }
}
abstract class Animal{
    void print(){
        System.out.println("Animmal eats  :");
    }
    abstract void walk();
}
class Dog extends Animal{
    void walk(){
        System.out.println("Dog four legs  :");
    }
}
class Chiken extends Animal{
    void walk(){
        System.out.println("Chiken two legs  :");
    }
}
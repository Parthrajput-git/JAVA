import java.util.*;
public class MultiInher{
    public static void main(String args[]){
    Area sc=new Area();
    sc.print();
    sc.cm="Shri Dr.Mohan yadav ji";
    System.out.println(sc.cm);
    }
}
class Mp{
String cm;
int voting; 
void print(){
    System.out.println("Voting for impotentents  :");
}


}
class Distric extends Mp{
String works;
void pri(){
System.out.println("I am very sloaw  :");
}
}
class Area extends Distric{
int projects;
void pro(){
System.out.println("I don't no");
}
}
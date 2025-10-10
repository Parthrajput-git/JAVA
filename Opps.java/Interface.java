import java.util.*;
public class Interface{
public static void main(String args[]){
 Queen sc=new Queen();
 sc.moves();
 Rooks cs=new Rooks();
 cs.moves();
}
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
 public void moves(){
    System.out.println("(4 moves)  :");
 }
}
class Rooks implements Chessplayer{
    public void moves(){
        System.out.println("4 dircetion moves  :");
}
}
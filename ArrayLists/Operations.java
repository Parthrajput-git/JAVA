import java.util.ArrayList;
public class Operations{
    public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Boolean> list3 = new ArrayList<>();
    ArrayList<Float> list4 = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
   // list.set(2,6);
    // System.out.println(list);
    // //  int re=list.get(3);
    // //  System.out.println(re);
    // //  list.remove(3);
    // System.out.println(list.contains(2));
    // System.out.println(list.contains(11));
    System.out.println(list.size());
    for(int i=0;i<list.size();i++){
    System.out.print(list.get(i)+" ");
    }
    System.out.println();
    }
}
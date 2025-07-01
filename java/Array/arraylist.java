import java.util.*;
public class arraylist{
    public static void main(String[] args){
         ArrayList<String> list = new  ArrayList<>();
         list.add("gayathri");
         list.add("abinaya");
         list.add("keerthana");
         list.add("karthika");
         System.out.println(list);
         System.out.println(list.reversed());
         System.out.println(list.remove("gayathri"));
         System.out.println(list);
         Collections.shuffle(list);
         System.out.println(list);
         ArrayList list2 = new ArrayList();
          list2=(ArrayList)list.clone();
         System.out.println(list2);
         list.add(1,"gayathri");
        System.out.println(list);
        System.out.println(list2);
    }
}
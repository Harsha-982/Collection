package src.main.java.List.arrayList;
import java.util.ArrayList;
public class Retrive {
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);

        // to retrive single one
        System.out.println(list.get(3));

        // to retrive a portion of it
        System.out.println(list.subList(0,2));
    }
}

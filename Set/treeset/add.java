package src.main.java.Set.treeset;

import java.util.Collections;
import java.util.TreeSet;

public class add {
    public static void main(String[] args){
        TreeSet set=new TreeSet();
        set.add(10);
        Collections.addAll(set,2,4,54,3);

        //no INSERTION ORDER
        System.out.println(set);// gives ascending order 2 3 4 10 54

        //up to certain place
        System.out.println(set.headSet(4)); // 2 3

        //descending set
        System.out.println(set.descendingSet());

        //takes all elements in given range
        System.out.println(set.subSet(0,18));// 2 3 4 10

        //takes all elements from a place to end
        System.out.println(set.tailSet(3));
    }
}

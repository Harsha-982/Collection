package src.main.java.List.linkedList;

import java.util.*;
import java.util.Arrays;

public class Iterations {
    public static void main(String[] args){
        LinkedList firstlist=new LinkedList();
        ArrayList secondlist=new ArrayList();
        firstlist.add(10);
        firstlist.add(11);
        firstlist.add(12);

        secondlist.add(1);
        secondlist.add(2);
        secondlist.add(3);

        firstlist.addAll(2,secondlist); //add at index 2
        System.out.println(firstlist);

        //iterate completely
        Iterator iter=firstlist.iterator();
        while(iter.hasNext()){
            if(iter.next().equals(2)) {
                iter.remove();
            }
        }

        //iterate from particular index
        ListIterator sepecificIndex=firstlist.listIterator(1);
        while(sepecificIndex.hasNext()){
            System.out.println(sepecificIndex.next());
        }
        // reverse order of a linked list
        // doesn't work for arraylist works only for linkedlist
        Iterator descending= firstlist.descendingIterator();
        while (descending.hasNext()){
            System.out.println(descending.next());
        }

    }

}

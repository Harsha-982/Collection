package src.main.java.List.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionInterface {

    public static void main(String[] args){
        List list=new ArrayList();

        List sublist=new ArrayList();

        list.add(21);
        list.add(56);
        list.add(84);
        list.add(11);

        Collections.sort(list);
        Collections.swap(list,1,2);
        //to add elements in bulk
        Collections.addAll(list,1,2,4,5,9);
        System.out.println("First list "+list);

        //to shuffle
        Collections.shuffle(list);
        System.out.println("Shuffled list "+list);

        //to reverse
        Collections.reverse(list);
        System.out.println("Reveresed list "+list);

        //binary search
        Object findNumber=Collections.binarySearch(list,2);
        System.out.println("Number "+findNumber);

        // checks whether to collections share same elements
        Collections.addAll(sublist, 3,6,7);
        System.out.println(Collections.disjoint(list,sublist)); // no common so true

        //maximum and minimum number in the collections

        System.out.println(Collections.max(list)+" "+Collections.min(list));

        //rotate an collection by specified number
        Collections.rotate(list,2);
        System.out.println("After rotating the list"+list);

    }

}

package src.main.java.Set.hashset;

import java.util.*;

public class Iterations {
    public static  void main(String[] args){
        Set set=new HashSet();
        Collections.addAll(set,2,4,5,3,6,4);

        //Write a Java program to iterate through all elements in a hash list

        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // Write a Java program to get the number of elements in a hash set
        System.out.println("Length of the list "+set.size());

        //to check the set is empty or not
        System.out.println(set.isEmpty());

        Object[] arr=set.toArray();
        System.out.println(arr);//converted to class

        // to any datatype array
        Integer[] integerarray=new Integer[set.size()];
        set.toArray(integerarray);
        for(Integer i: integerarray){
            System.out.println(i);
        }

        Arrays.stream(integerarray).forEach(s-> System.out.println(s));
    }
}

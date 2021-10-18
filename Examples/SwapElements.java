package src.main.java.Examples;

import java.util.Collections;
import java.util.LinkedList;

public class SwapElements {
    public static void main(String[] args){
        LinkedList list =new LinkedList();
        list.add(87);list.add(878);list.add(28);list.add(50);

        //swap element at index 1 and 3

        for(int  i=0;i<list.size();i++){
            int firstnumber= (int) list.get(1);
            if(i==1){
                list.set(1,list.get(3));
                list.set(3,firstnumber);
            }
        }
        System.out.println(list);// here now 50 is 1st element and 878 is last element

        Collections.swap(list,1,3);
        System.out.println(list); // after swap 878 is 1st element and 50 is last element
    }
}

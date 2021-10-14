package src.main.java.Examples;

import java.util.LinkedList;

public class elePositionPrint {
    public static void main(String[] args){
        LinkedList list =new LinkedList();
        list.add(10);list.add(20);list.add(30);list.add(40);list.add(50);
        for(int i=0;i<list.size();i++){
            System.out.println("Element at index "+i+" is "+list.get(i));
        }
    }
}

package src.main.java.List.linkedList;

import java.util.LinkedList;

public class AddDelElement {
    public  static void main(String[] args){
        LinkedList list=new LinkedList();
        list.add(1);
        list.add(2);
        list.addLast(3);
        list.addFirst(0);
        list.offer(6);
        list.offerLast(7);
        list.offerFirst(8);
        System.out.println(list.element()); // retrive head of the linked list
        System.out.println(list);

        //remove element
        list.poll();// remove head of the linked list
        list.pop(); // removes first element of the list
        System.out.println(list);
//        list.remove(1);
//        list.removeFirst();
//        list.removeLast();
//        list.removeLastOccurrence(Obj);
    }
}

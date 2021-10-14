package src.main.java.Examples;

import java.util.ArrayList;
import java.util.Scanner;

public class crudOperationsExample {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int len=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<len;i++){
            list.add(sc.nextInt());
        }
        int queries=sc.nextInt();
        for(int i=0;i<queries;i++){
            String operation=sc.next();
            if(operation.equals("Delete")){
                int x=sc.nextInt();
                list.remove(x);
            }
            else if(operation.equals("Insert")){
                int x=sc.nextInt();
                int  y=sc.nextInt();
                list.add(x,y);
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}

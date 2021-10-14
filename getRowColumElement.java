package src.main.java.Examples;
import java.util.ArrayList;
import java.util.Scanner;

// to find element in line x and position y
/* if not found display error
input: 5-testcases                                          output: 3
       2 3 4                                                        4
       5 1 3 4 5 2
       1 3
       0
       3 1 3 4
       2-no of elements to find
       1 1
       2 3
 */
public class getRowColumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        ArrayList[] list = new ArrayList[testcases];
        for (int i = 0; i < testcases; i++) {
            int len = sc.nextInt();
            list[i] = new ArrayList();
            for (int j = 0; j < len; j++) {
                list[i].add(sc.nextInt());
            }
        }
        int findelement = sc.nextInt();
        for (int i = 0; i < findelement; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(list[x - 1].get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}

package Java.DataStructures.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        List<Integer> myList = new ArrayList<>();
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            int val = sc.nextInt();
            myList.add(val);
            num--;
        }
        int query = sc.nextInt();
        while (query > 0) {
            String q = sc.next();
            if (q.equals("Insert")) {
                int index = sc.nextInt();
                int element = sc.nextInt();
                myList.add(index, element);
            }
            if (q.equals("Delete")) {
                int index = sc.nextInt();
                myList.remove(index);
            }
            query--;
        }
        for (Integer i : myList) {
            System.out.print(i + " ");
        }
    }
}

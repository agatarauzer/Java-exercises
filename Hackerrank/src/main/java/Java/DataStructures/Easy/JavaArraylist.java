package Java.DataStructures.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int numOfLines = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        while (numOfLines > 0) {
            int numOfElements = sc.nextInt();
            List<Integer> elements = new ArrayList<>();
            while (numOfElements > 0) {
                int elem = sc.nextInt();
                elements.add(elem);
                numOfElements--;
            }
            list.add(elements);
            numOfLines--;
        }
        int numOfQueries = sc.nextInt();
        while (numOfQueries > 0) {
            int line = sc.nextInt();
            int position = sc.nextInt();
            if (line > list.size()) {
                System.out.println("Line: ERROR!");
            }
            else {
                List<Integer> subList = list.get(line - 1);
                if (position > subList.size()) {
                    System.out.println("ERROR!");
                }
                else {
                    int element = subList.get(position - 1);
                    System.out.println(element);
                }
            }
            numOfQueries--;
        }
    }
}

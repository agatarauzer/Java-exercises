package Java.Strings.Easy;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        s = s.trim();
        //find words with no letters
        if (s.isEmpty()) {
            System.out.println("0");
            return;
        }

        String[] tokens = s.split("[^a-zA-Z]+");
        System.out.println(tokens.length);
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }

        scan.close();
    }
}

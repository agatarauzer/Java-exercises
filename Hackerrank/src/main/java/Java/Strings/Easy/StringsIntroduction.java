package Java.Strings.Easy;

import java.util.Scanner;

public class StringsIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());

        char a = A.charAt(0);
        char b = B.charAt(0);
        if (a > b) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}

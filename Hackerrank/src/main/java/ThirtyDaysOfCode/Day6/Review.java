package ThirtyDaysOfCode.Day6;

import java.util.Scanner;

public class Review {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfTests = scan.nextInt();
        while (numberOfTests > 0) {
            String word = scan.next();
            String oddPositions = "";
            String evenPositions = "";
            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) {
                    evenPositions += word.charAt(i);
                }
                else {
                    oddPositions += word.charAt(i);
                }
            }
            System.out.println(evenPositions + " " + oddPositions);
            numberOfTests--;
        }
        scan.close();
    }
}

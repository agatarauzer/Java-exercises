package Java.Strings.Easy;

import java.util.Scanner;

public class ValidUsernameRegularExpression {

    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

    public class Solution {
        private final Scanner scan = new Scanner(System.in);

        public void main(String[] args) {
            int n = Integer.parseInt(scan.nextLine());
            while (n-- != 0) {
                String userName = scan.nextLine();
                if (userName.matches(ValidUsernameRegularExpression.regularExpression)) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }
        }
    }
}


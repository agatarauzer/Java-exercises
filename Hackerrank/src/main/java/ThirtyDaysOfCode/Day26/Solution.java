package ThirtyDaysOfCode.Day26;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int dayRet = sc.nextInt();
        int monthRet = sc.nextInt();
        int yearRet = sc.nextInt();

        int dayDue = sc.nextInt();
        int monthDue = sc.nextInt();
        int yearDue = sc.nextInt();

        int fine = 0;
        if (yearRet > yearDue) {
            fine += 10000;
        }
        else {
            if (yearRet == yearDue) {
                if (monthRet == monthDue) {
                    if (dayRet > dayDue) {
                        fine += (dayRet - dayDue) * 15;
                    }
                }
                else if (monthRet > monthDue) {
                    fine += (monthRet - monthDue) * 500;
                }

            }
        }
        System.out.println(fine);
    }
}

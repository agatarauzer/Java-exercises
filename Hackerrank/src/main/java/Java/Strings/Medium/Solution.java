package Java.Strings.Medium;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here

class MyRegex {
    //check for: 0-9 with leading zero, 0-9 with two leading zeros, 0-9, 10-99 with leading zero, 10-99, 100-199, 200-249, 250-255
    private static String segment = "(0[0-9]|00[0-9]|[0-9]|0[1-9][0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    public static String pattern = "^" + segment + "." + segment + "." + segment + "." + segment + "$";
}


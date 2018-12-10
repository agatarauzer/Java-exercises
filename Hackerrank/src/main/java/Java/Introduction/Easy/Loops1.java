package Java.Introduction.Easy;

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}

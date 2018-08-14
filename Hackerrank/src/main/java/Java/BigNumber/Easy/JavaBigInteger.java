package Java.BigNumber.Easy;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        BigInteger sum = a.add(b);
        BigInteger mul = a.multiply(b);

        System.out.println(sum + "\n" + mul);
    }
}

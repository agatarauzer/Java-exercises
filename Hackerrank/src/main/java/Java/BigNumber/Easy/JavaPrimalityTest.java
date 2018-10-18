package Java.BigNumber.Easy;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger nb = new BigInteger(n);

        String result = nb.isProbablePrime(1) ? "prime" : "not prime";
        System.out.println(result);

        scanner.close();
    }
}

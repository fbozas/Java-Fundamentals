package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη με BigInteger.
 */
public class BigIntPowerApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int a;
        int n;
        BigInteger result = BigInteger.ONE;

        // Εντολές
        System.out.println("Please insert two its, base and power");
        a = in.nextInt();
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(a));
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%d^%d = %,d", a, n, result);
    }
}

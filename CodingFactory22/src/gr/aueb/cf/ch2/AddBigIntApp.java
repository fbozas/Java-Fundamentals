package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Demonstrates BigInteger class.
 */

public class AddBigIntApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        BigInteger bigNum = new BigInteger("21474836473694");
        BigInteger bigNum2 = new BigInteger("21474836473694");
        BigInteger result = new BigInteger("0");

        // Εντολές
        result = bigNum.add(bigNum2);

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("The very big result is: %,d", result);
    }
}

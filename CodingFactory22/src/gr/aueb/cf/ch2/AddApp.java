package gr.aueb.cf.ch2;

/**
 * Overflow
 */

public class AddApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 2_147_483_647; // max value
        int num2 = 2;
        int result = 0;

        // Εντολές
        result = num1 + num2;

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Sum: " + result); // result is overflowed cause of max value of int
    }
}

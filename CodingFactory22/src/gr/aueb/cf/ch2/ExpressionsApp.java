package gr.aueb.cf.ch2;

/**
 * Expressions Examples
 */

public class ExpressionsApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        // Εντολές
        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;
        result1 = num1++;  // result1 -> 12, num1 -> 13
        result2 = ++num2;  // num2 -> 6, result2 -> 6

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("sum: %d, sub: %d, mul: %d, div: %d, mod: %d\n", sum, sub, mul, div, mod);
        System.out.printf("result1: %d, num1: %d, result2: %d, num2: %d", result1, num1, result2, num2);
    }
}

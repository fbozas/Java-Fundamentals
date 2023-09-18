package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Υπολογίζει την δύναμη a εις την n.
 */

public class PowerApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;
        int result = 1;

        // Εντολές
        System.out.println("Please insert base, power");
        a = in.nextInt();
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            result *= a;
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Result: " + result);
    }
}

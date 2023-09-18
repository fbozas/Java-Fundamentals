package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Προσθέτει και πολλαπλασιάζει n πρώτους ακεραίους.
 * Το n το δίνει ο χρήστης
 */
public class AddMullApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int result = 1;

        // Εντολές
        System.out.println("Please insert a num (int)");
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
            result *= i;
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Sum: " + sum);
        System.out.println("Mull: " + result);
        System.out.printf("Mull: %,d", result);
    }
}

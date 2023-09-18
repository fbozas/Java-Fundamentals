package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει αριθμούς και κρατάει το πλήθος μέχρι ο χρήστης να εισάγει το 0.
 */

public class SentinelApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        // Εντολές
        System.out.println("Please provide a num");
        num = in.nextInt();
        while (num != 0) {
            //System.out.println(num);
            iterations++;
            System.out.println("Please provide a num");
            num = in.nextInt();
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%d interations", iterations);
    }
}

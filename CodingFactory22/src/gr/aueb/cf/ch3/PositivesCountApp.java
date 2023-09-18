package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των θετικών αριθμών που δίνει ο χρήστης.
 */
public class PositivesCountApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        // Εντολές
        System.out.println("Please give a num (int)");
        num = in.nextInt();

        while (num >= 0) {
            positivesCount++;
            System.out.println("Please give a num (int)");
            num = in.nextInt();
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Positive-count: " + positivesCount);
    }

}

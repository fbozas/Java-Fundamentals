package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δείχνει τη χρήση των break και continue.
 */

public class BreakContinueApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        // Εντολές
        while (true) {
            System.out.println("Please provide a num");
            num = in.nextInt();

            // αποκλείει το 5 από το sum.
            if (num == 5) {
                continue;
            }
            sum += num;
            if (num == 10) {
                System.out.println("Bingo!!!");
                break;
            }
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Sum: " + sum);
    }
}

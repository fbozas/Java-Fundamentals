package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει τον μέσο όρο της βαθμολογίας ενός μαθητή.
 * total grade, courses count, average grade
 */
public class AverageApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int average = 0;

        // Εντολές
        System.out.println("Please provide total and count");
        total = in.nextInt();
        count = in.nextInt();

        if (count == 0) {
            System.out.println("Invalid count");
            System.exit(1);
        }

        if (total <= 0) {
            System.out.println("Invalid total");
            System.exit(1);
        }

        average = total / count;

        // Εκτύπωση αποτελεσμάτων
        if (average > 10) {
            System.out.println("Invalid average");
            System.exit(1);
        }

        if (average >= 9) { // always we go from bigger (specific) to lower (general)
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very Good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Fail");
        }
    }
}

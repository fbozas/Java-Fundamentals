package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει αποτ το stdin το start-value, end-value, step και εκτυπώνει το πλήθος των επαναλήψεων.
 */
public class ForFlexApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int startValue;
        int endValue;
        int step;
        int iterations = 0;

        // Εντολές
        System.out.println("Provide start, end, step values");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        // Εκτύπωση αποτελεσμάτων
        for (int i = startValue; i <= endValue; i += step) {
            iterations++;
            System.out.print(i + " ");
        }
        System.out.print("Iterations: " + iterations);
    }
}

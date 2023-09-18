package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό n!
 */
public class FactorialApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        long facto = 1L;
        int i = 1;
        int n = 0;

        // Εντολές
        System.out.println("Please insert n");
        n = in.nextInt();
        while (i <= n) {
            facto *= i;
            i++;
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%d! = %,d", n, facto);
    }
}

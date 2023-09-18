package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ternary operator
 */
public class AbsApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        // Εντολές
        System.out.println("Please provide a num");
        num = in.nextInt();
        abs = (num > 0) ? num : -num;
//        abs = (num > 0) ? num : (num < 0) ? -num : 0;

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Abs: " + abs);
    }
}

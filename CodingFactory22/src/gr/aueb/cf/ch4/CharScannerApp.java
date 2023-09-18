package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει ένα char με Scanner.
 */

public class CharScannerApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        char inputChar;

        // Εντολές
        System.out.println("Please insert a char");
        inputChar = in.next().charAt(0);  //.charAt(0) -> Takes the first char

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Char: " + inputChar);
    }
}

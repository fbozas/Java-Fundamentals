package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 * Διαβάζει ένα char με τη System.in.read()
 */

public class CharInputApp {

    public static void main(String[] args) throws IOException {
        // Δήλωση και αρχικοποίηση μεταβλητών
        char inputChar = ' ';

        // Εντολές
        System.out.println("Please insert an ASCII char");
        inputChar = (char)System.in.read();

        // Εκτύπωση αποτελεσμάτων
        System.out.println("char: " + inputChar);
    }
}

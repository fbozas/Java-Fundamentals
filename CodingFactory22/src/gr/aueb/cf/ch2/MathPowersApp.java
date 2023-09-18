package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Βρίσκει το τετράγωνο και τον κύβο ενός ακεραίου που δίνει ο χρήστης.
 */
public class MathPowersApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        // Εντολές
        System.out.println("Please insert a num (int)");
        inputNum = in.nextInt();

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("num: %d, square: %d, cube: %d",
                inputNum, (int)Math.pow(inputNum, 2), (int)Math.pow(inputNum, 3));
    }
}

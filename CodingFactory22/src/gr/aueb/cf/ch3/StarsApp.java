package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εκτυπώνει n οριζόντια αστεράκια, όπου n ένας ακέραιος που δίνει ο χρήστης.
 */
public class StarsApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 1;

        // Εντολές
        System.out.println("Please insert number of stars");
        numberOfStars = in.nextInt();

        // Εκτύπωση αποτελεσμάτων
        while (i <= numberOfStars) {
            System.out.print("*");
            i++;
        }
    }
}

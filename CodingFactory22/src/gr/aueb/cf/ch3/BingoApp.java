package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Κάνει bingo όταν ο χρήστης μαντέψει ένα secret key.
 */
public class BingoApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 11;

        // Εντολές & Εκτύπωση αποτελεσμάτων
        while (true) {
            System.out.println("Please provide a secret num");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo");
                break;
            } else {
                System.out.println("a ha ha, you didn't say the magic word!");
            }
        }
    }
}

package gr.aueb.cf.ch2;

/**
 * Ρίχνει δύο ζάρια.
 */
public class RandomDiceApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int die1 = 0;
        int die2 = 0;

        // Εντολές
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Die 1: %d, Die 2: %d", die1, die2);
    }
}

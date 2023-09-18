package gr.aueb.cf.ch6;

public class ArraySearchApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        final int SECRET = 12;
        int arr[] = {1, 5, 9, 3, 12};
        boolean secretIsFound = false;

        // Εντολές
        for (int item : arr) {
            if (item == SECRET) {
                secretIsFound = true;
                break;
            }
        }

        // Εντολές & Εκτύπωση αποτελεσμάτων
        if (secretIsFound) {
            System.out.println("Secret key was found");
        } else {
            System.out.println("Secret key is not found");
        }
    }
}

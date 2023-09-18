package gr.aueb.cf.ch5;

/*
*   Ελέγχει ισότητα / ανισότητα στους
*   floating points. Αν η διαφορά ειναι
*   πολύ μικρή υπάρχει ισότητα
*/
public class DoubleCompareApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        double d1 = 0.9999;
        double d2 = 1.0001;
        final double EPSILON = 0.005;

        // Εντολές & Εκτύπωση αποτελεσμάτων
        if (Math.abs(d2 - d1) <= EPSILON) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}

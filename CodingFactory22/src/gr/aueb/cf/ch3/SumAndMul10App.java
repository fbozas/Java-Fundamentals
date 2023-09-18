package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άθροισμα και το γινόμενο των 10 πρώτων ακεραίων.
 */
public class SumAndMul10App {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int sum = 0;
        int mul = 1;
        int i = 1;

        // Εντολές & Εκτύπωση αποτελεσμάτων
        while (i <= 10) {
            sum += i;
            mul *= i;
            i++;
            System.out.println("Sum: " + sum);
            System.out.println("Mul: " + mul);
        }
    }
}

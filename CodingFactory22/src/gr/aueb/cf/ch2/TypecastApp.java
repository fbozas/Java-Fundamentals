package gr.aueb.cf.ch2;

public class TypecastApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 10;
        long num2 = 20L;
        long result = 0L;

        // Εντολές
//        num1 = num2; // error
        num1 = (int)num2;

        // Εκτύπωση αποτελεσμάτων
        result = num1 + num2; // Here num1 will be converted (widening) to long data type
    }
}

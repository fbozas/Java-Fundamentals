package gr.aueb.cf.ch5;

/*
*   Float / Double Expression
*/
public class Expression {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        double num1 = 12.5;
        double num2 = 2.0;
        double result;
        double mod;

        // Εντολές
        result = num1 / num2; // 6.25
        mod = num1 % num2; // 0.5

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%f / %f = %f\n", num1, num2, result);
        System.out.printf("%f %% %f = %f\n ", num1, num2, mod);
//        System.out.printf("Result = %.2f, Mod = %.2f", result, mod);
    }
}

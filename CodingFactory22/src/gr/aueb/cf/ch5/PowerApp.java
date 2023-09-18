package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει a εις την n
 */
public class PowerApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int a;
        int n;
        int result;

        // Εντολές
        System.out.println("Please insert a num and a power");
        a = in.nextInt();
        n = in.nextInt();
        result = pow(a, n);

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Result of %d power %d = %d", a, n, result);
    }

    /*
    *    Returns the power of an int
    *
    *   @param a    the base
    *   @param n    the power to raise
    *   @return     the power og a^n
    */
    public static int pow(int a, int n) {
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power *= a;
        }
        return power;
    }
}

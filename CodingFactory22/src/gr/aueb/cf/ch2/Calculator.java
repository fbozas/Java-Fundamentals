package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει δύο ακεραίους και υπολογίζει τα +, -, *, /, %.
 */
public class Calculator {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        // Εντολές
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Sub: " + (num1 - num2));
        System.out.println("Mul: " + (num1 * num2));
        System.out.println("Div: " + (num1 / num2));
        System.out.println("Mod: " + (num1 % num2));
    }
}

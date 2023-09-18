package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * α εις την β
 */
public class PowerApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;
        int i = 1;

        // Εντολές
        System.out.println("Please insert a, b");
        a = in.nextInt();
        b = in.nextInt();
        while (i <= b) {
            result *= a;
            i++;
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Result: %d", result);
    }
}

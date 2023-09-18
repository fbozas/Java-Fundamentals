package gr.aueb.cf.ch5;

import java.util.Scanner;
/*
*   Λαμβάνει 3 τιμές απο τον χρήστη, τις
*   a, b, c όπου α είναι η υποτείνουσα και
*   b, c οι δύο πλευρές
*
*   Ελέγχει αν το τρίγωνο είναι ορθογώνιο, δηλ. \
*   α ^ 2 == b ^ 2 + c ^ 2
*
*   Έστω EPSILON = 0.000005 (έξι σημαντικά ψηφία)
*/
public class RightTriangleApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;

        // Εντολές & Εκτύπωση αποτελεσμάτων
        System.out.println("Please provide a, b, c (doubles)");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(Math.pow(a, 2.0)) - (Math.pow(b, 2.0)) + (Math.pow(c, 2.0)) < EPSILON) {
            System.out.println("The triangle is right");
        } else {
            System.out.println("The triangle is not right");
        }
    }
}

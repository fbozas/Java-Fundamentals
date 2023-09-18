package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ένα αεροσκάφος έχει δύο δεξαμενές. Αν μία δεξαμενή έχει λιγότερο απο 1/4 καύσιμα
 * τότε ανάβει πορτοκαλί σήμα, ενώ αν και οι δύο δεξαμενές < 1/4 καύσιμα τότε ανάβει
 * κόκκινο σήμα.
 *
 * Ο πιλότος (χρήστης) δίνει true ή false ανάλογα αν tank < 1/4 ή όχι αντίστοιχα
 */
public class OrangeRedSignalApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        boolean isTank1LessThanQuarter = false;
        boolean isTank2LessThanQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        // Εντολές
        System.out.println("Please insert if tank1, tank2 are less than 1/4");
        isTank1LessThanQuarter = in.nextBoolean();
        isTank2LessThanQuarter = in.nextBoolean();
        orangeOn = isTank1LessThanQuarter || isTank2LessThanQuarter;
        redOn = isTank1LessThanQuarter && isTank2LessThanQuarter;

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Orange on:" + orangeOn);
        System.out.println("Red on:" + redOn);
    }
}

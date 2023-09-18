package gr.aueb.cf.ch2;

import java.util.Scanner;

/*
* Μετατρέπει τα day, month, year (yyyy)
* σε μορφή dd/mm/yy
* */
public class DateApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        // Εντολές
        System.out.println("Please provide day, month, year");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Date is: %02d/%02d/%02d", day, month, year % 100);
    }
}

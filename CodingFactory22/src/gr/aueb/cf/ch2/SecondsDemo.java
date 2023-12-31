package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει δευτερόλεπτα σε Days, Hours, Minutes
 */
public class SecondsDemo {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        final int DAY_SECS = 24 * 3600;
        final int HOUR_SECS = 3600;
        final int MINUTE_SECS = 60;
        int inputSeconds = 0;
        int remainingSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        // Εντολές
        System.out.println("Please insert an amount of seconds");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;
        days = remainingSeconds / DAY_SECS;
        remainingSeconds %= DAY_SECS;
        hours = remainingSeconds / HOUR_SECS;
        remainingSeconds %= HOUR_SECS;
        minutes = remainingSeconds / MINUTE_SECS;
        remainingSeconds %= MINUTE_SECS;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%,d input seconds = %d days, %d hours, %d minutes, %d seconds",
                inputSeconds, days, hours, minutes, remainingSeconds);
    }
}

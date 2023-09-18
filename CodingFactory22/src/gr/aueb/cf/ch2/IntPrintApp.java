package gr.aueb.cf.ch2;

public class IntPrintApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int i = 12;
        int j = 534_567_987;

        // Εκτύπωση αποτελεσμάτων
        System.out.print(i);
        System.out.println(i);
        System.out.printf("%d", i);

        System.out.print("Result = " + i);
        System.out.println("Result = " + i);
        System.out.printf("Result = %d%n", i); // %n is compatible for all OS (Mac, Linux, Windows)

        System.out.println("**********************");
        System.out.printf("%4d\n", i); // Creates 2 spaces
        System.out.printf("%04d\n", i); // Creates 2 0s
        System.out.printf("%,02d\n", j); // Adds separators
        System.out.printf("%010d\n", i);
    }
}

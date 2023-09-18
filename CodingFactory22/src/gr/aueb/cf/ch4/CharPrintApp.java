package gr.aueb.cf.ch4;
/*
*   Prints char values
*   https://commons.wikimedia.org/wiki/File:ASCII-Table.svg (Look at decimal & char columns)
*/
public class CharPrintApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        char ch1 = '!';
        char ch2 = '8';

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("char: %c, ordinal: %d\n", ch1, (int) ch1);
        System.out.printf("char: %c, ordinal: %d\n", ch2, (int) ch2);
    }
}

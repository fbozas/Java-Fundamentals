package gr.aueb.cf.ch4;

/*
*   Prints a smiley
*   http://russellcottrell.com/greek/utilities/SurrogatePairCalculator.htm
*/
public class SmileyApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int codePoint = 0x1F600;

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Smiley: " + codePoint);
        System.out.println("Smiley: \ud83d\ude00");
    }
}

package gr.aueb.cf.ch4;

public class AllEmojisApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int i = 0;

        // Εντολές & εκτύπωση αποτελεσμάτων
        i = emojiStart;
        while (i <= emojiEnd) {
            char[] emoji = Character.toChars(i);
            System.out.print(emoji);
//            System.out.print(Character.toChars(i));
            System.out.print(" ");
            i++;
            if (i % 16 == 0) System.out.println();
        }
    }
}

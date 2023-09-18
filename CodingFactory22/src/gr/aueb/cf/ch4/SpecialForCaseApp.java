package gr.aueb.cf.ch4;

/*
*   Infinite loop
*/
public class SpecialForCaseApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int counter = 0;

        // Εντολές & εκτύπωση αποτελεσμάτων
        for(;;){
            System.out.print("forever ");
            counter++;
            if (counter % 20 == 0) System.out.println();
            if(counter == 100) break;
        }
    }
}

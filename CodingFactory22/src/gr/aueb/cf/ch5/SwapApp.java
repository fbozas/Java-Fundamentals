package gr.aueb.cf.ch5;
/*
    Ανταλλάσσει αμοιβαία δύο τιμές
    που δίνει ο χρήστης
 */

public class SwapApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int a = 10;
        int b = 20;

        // Εντολές
        swap(a,b); // Με την συνάρτηση δεν αλλάζουν οι τιμές γιατί ότι γίνεται ζει και πεθαίνει μέσα στη συνάρτηση

        //Εκτύπωση αποτελεσμάτων
        System.out.println("a = " + a + " b = " + b);
    }

    /*
    * Swaps a,b, s = a -> b, b -> a
    *
    * @param a the first value
    * @param b the second value
    */

    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
}

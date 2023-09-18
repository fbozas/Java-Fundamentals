package gr.aueb.cf.ch5;

import java.util.Scanner;
/*
*   Αποφασίζει αν ένας int είναι
*   άρτιος ή περιττός
*/
public class EvenOddApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num;
        boolean isNumEven = false;

        // Εντολές
        System.out.println("Please insert an int");
        num = in.nextInt();
        isNumEven = isEven(num);

        //Εκτύπωση αποτελεσμάτων
        System.out.println("Num " + num + " is even: " + isNumEven);
    }


    /*
    *   Evaluates an int if it is even or not
    *   @param n    the number (int) to evaluate
    *   @return     true, if n is even, false otherwise
    */
    public static boolean isEven(int n) {
//        if (n % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return n % 2 == 0;
    }
}

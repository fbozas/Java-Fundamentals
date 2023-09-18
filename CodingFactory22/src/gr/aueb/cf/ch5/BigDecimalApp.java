package gr.aueb.cf.ch5;

import java.math.BigDecimal;

/*
* Floating points Demo with BigDecimal class
*/

public class BigDecimalApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        BigDecimal actual = new BigDecimal("0.0");
        BigDecimal expected = new BigDecimal("1.0");

        // Εντολές & Εκτύπωση αποτελεσμάτων
        for(int i = 1; i <= 10; i++){
            actual = actual.add(BigDecimal.valueOf(0.1));
        }

        System.out.println(actual);
        System.out.println(expected);

        if(actual.equals(expected)){
            System.out.println("EQUALS");
        }else {
            System.out.println("NOT Equals");
        }

    }
}

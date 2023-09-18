package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int numerator;
        int denominator;
        int result;

        try{
            System.out.println("Please insert two int for division");
            numerator = sc.nextInt();
            denominator = sc.nextInt();

            result = numerator / denominator;

            System.out.printf("%d / % d = %d ", numerator, denominator, result);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Λάθος Παρανομαστής");
        }
    }
}

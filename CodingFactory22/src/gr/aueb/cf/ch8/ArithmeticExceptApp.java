package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int result;

        System.out.println("Please insert");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

//        try{
//            result = num1 / num2;
//        }catch(ArithmeticException e){
//            System.out.println("Please...");
//        }

        if(num2 == 0){
            System.out.println("Please");
            System.exit(1);
        }

        result = num1 / num2;
    }
}

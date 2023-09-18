package gr.aueb.cf.ch8;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum;
        final int MAGIC_NUM = 12;
        
        while (true){

            try{
                System.out.println("Please insert a num");

                inputNum = sc.nextInt();

                if(inputNum == MAGIC_NUM){
                    System.out.println("Great!");
                    break;
                }
            }catch(InputMismatchException e){ // If user give a character
//                e.printStackTrace();
                sc.nextLine(); // If we dont put this here we will have an infinite loop
                System.out.println("Please insert an int");
            }
        }

        System.out.println("Thanks for using the Magic App");
    }
}

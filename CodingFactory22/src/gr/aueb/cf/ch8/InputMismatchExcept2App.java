package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExcept2App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum;
        final int MAGIC_NUM = 12;

        while (true){

                System.out.println("Please insert a num");

                if(sc.hasNextInt()){
                    inputNum = sc.nextInt();
                }else {
                    sc.nextLine();
                    System.out.println("Error. Please insert a valid int");
                    continue;
                }

                if(inputNum == MAGIC_NUM){
                    System.out.println("Great!");
                    break;
                }
        }

        System.out.println("Thanks for using the Magic App");
    }
}

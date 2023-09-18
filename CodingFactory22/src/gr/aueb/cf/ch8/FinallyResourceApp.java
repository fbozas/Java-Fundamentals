package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyResourceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        try{
            num = sc.nextInt();
            System.out.println(num);
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
        finally {
            try{
                if(sc != null) sc.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

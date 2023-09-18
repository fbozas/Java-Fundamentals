package gr.aueb.cf.ch1;

import gr.aueb.cf.ch11.HelloUtil;
import gr.aueb.cf.ch1.model.Point;

import java.util.Scanner;

/**
 * Εκτυπώνει Hello World! στο standard output (κονσόλα).
 */
public class HelloWorld {

    private Scanner sc = new Scanner(System.in);
    private Point point;
    private String s;

    //psvn (shortcut)
    public static void main(String[] args) {

        //sout (shortcut)
        HelloUtil.sayHello();
        System.out.println("Hello World!");
    }
}

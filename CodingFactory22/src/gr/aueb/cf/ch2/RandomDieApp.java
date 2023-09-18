package gr.aueb.cf.ch2;

public class RandomDieApp {
    public static void main(String[] args) {
//        double die = (Math.random() * 6) + 1;
//        int die1 = (int)die;
//        System.out.println(die);
//        System.out.println(die1);

        int die = (int)(Math.random() * 6) + 1; // we typecast into int cause .random delivers only double
        System.out.println(die);

    }
}

package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι
 * Ο frog βρίσκεται στη θέση x και θέλει να φτάσει ]
 * στη θέση y (ή σε θέση > y). Ο Frog jumps a fixed distance D.
 *
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο small frog πρέπει
 * να κάνει ώστε να φτάσει (ή να ξεπεράσει) τον στόχο.
 *
 * Για παράδειγμα, αν έχουμε
 * X = 10
 * Y = 85
 * D = 30
 *
 * τότε ο small frog θα χρειαστεί 3 jumps γιατί:
 * Starts at 10 και μετά το 1ο jump πάεισ στη θέση 10 + 30 = 40
 * Στο 2o jump, πάει 40 + 30 = 70
 * Και στο 3ο jump, πάει 70 + 30 = 100
 */
public class FrogApp {

//    public static void main(String[] args) {
//        // Δήλωση και αρχικοποίηση μεταβλητών
//        int x;
//        int y;
//        int d;
//        int i;
//
//        // Εντολές
//        Scanner in = new Scanner(System.in);
//        System.out.println("Give x, y, d ");
//        x = in.nextInt();
//        y = in.nextInt();
//        d = in.nextInt();
//        for(i = 0; x < y; x = x + d){
//            i++;
//        }
//
//        // Εκτύπωση αποτελεσμάτων
//        System.out.println(i);
//    }

//    public static void main(String[] args) {
//        // Δήλωση και αρχικοποίηση μεταβλητών
//        int x;
//        int y;
//        int d;
//
//        // Εντολές
//        Scanner in = new Scanner(System.in);
//        System.out.println("Give x, y, d ");
//        x = in.nextInt();
//        y = in.nextInt();
//        d = in.nextInt();
//        int counter = 0;
//        for(int i = x; i <= y; i = i + d){
//            System.out.println("jump");
//            counter++;
//        }
//
//        // Εκτύπωση αποτελεσμάτων
//        System.out.println("Jumps made " + counter);
//    }

//    public static void main(String[] args) {
//        // Δήλωση και αρχικοποίηση μεταβλητών
//        Scanner in = new Scanner(System.in);
//        int startPos = 0;
//        int goal = 0;
//        int jumpDistance = 0;
//        int jumpCount = 0;
//
//        // Εντολές
//        System.out.println("Please insert starting position, goal and jumpDistance");
//        startPos = in.nextInt();
//        goal = in.nextInt();
//        jumpDistance = in.nextInt();
//        for(int i = startPos; i <= goal; i += jumpDistance){
//            jumpCount++;
//        }
//
//        // Εκτύπωση αποτελεσμάτων
//        System.out.printf("It took the frog %d jumps from %d to %d with a jump distance of % d  ", jumpCount, startPos, goal, jumpDistance);
//    }

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int jumps = 0;
        int x = 10;
        int y = 85;
        int jmp = 30;

        // Εντολές
       jumps = (int) Math.ceil((y - x) / (double) jmp);

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Jumps made " + jumps);
    }
}

package gr.aueb.cf.ch8;

import java.io.IOException;

/*
*   Demonstrates the usage of Exceptions
*/
public class ExceptApp {
//    public static void main(String[] args) throws IOException {
//        int ch = System.in.read();
//    }

//    public static void main(String[] args) {
//        try{
//            int ch = System.in.read();
//        } catch (IOException ex){
//            ex.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
//        int ch = getNextChar();
    }
//    public static int getNextChar(){
//        int ch = ' ';
//        try{
//            ch = System.in.read();
//            return ch;
//        } catch (IOException ex){
//            ex.printStackTrace();
//        }
//
//        return ch;
//    }

    public static int getNextChar() throws IOException{
        int ch = ' ';

        try{
            ch = System.in.read();
            return ch;
        } catch (IOException e){
            // 1. Rollback
            // 2. Logging
            e.printStackTrace();

            // Rethrow
            throw e;
        }
    }
}

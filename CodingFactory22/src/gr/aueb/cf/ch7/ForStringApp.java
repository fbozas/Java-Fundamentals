package gr.aueb.cf.ch7;

public class ForStringApp {

    public static void main(String[] args) {

        String s = "Coding Factory";

        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println("\u2764");

        for(char ch: s.toCharArray()){
            System.out.print(ch + " ");
        }

        System.out.println("\u2764");

        int index = s.indexOf("Cod");
        int indexFromZero = s.indexOf("o", 0);
        int indexFromSeven = s.indexOf("o", 7);
        int lastIndex = s.lastIndexOf("o");
        System.out.println(index);
        System.out.println(indexFromZero);
        System.out.println(indexFromSeven);
        System.out.println(lastIndex);

        System.out.println(s.startsWith("Coding"));
        System.out.println(s.substring(0,6));
    }
}

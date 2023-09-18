package gr.aueb.cf.ch7;

/*
*   Compares two string for equality
*/
public class EqualsApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("athens");

        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

        if(s1.equalsIgnoreCase(s3)){
            System.out.println("EQUAL");
        }
    }
}

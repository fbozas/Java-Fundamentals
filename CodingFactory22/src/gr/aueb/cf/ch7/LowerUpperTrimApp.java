package gr.aueb.cf.ch7;
/*
*   Transforms strings
*/
public class LowerUpperTrimApp {
    public static void main(String[] args) {
        String s = " Athens Uni ";
        String lowercase;
        String uppercase;
        String trimmed;
        String s2 = "";
        String s3 = " ";

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        lowercase = s.trim();

        System.out.println("*".repeat(10));

        System.out.println(s3.isBlank());
        System.out.println(s3.isEmpty());

        if(s2.isEmpty()){
            System.out.println(s2.length());
        }

        if(s2.isBlank()){
            System.out.println("Blank");
        }
    }
}
package gr.aueb.cf.ch20;

public class MatchesApp {
    public static void main(String[] args) {
        String s = "red";
        System.out.println(isRed(s));

        String digit = "1";
        System.out.println(isOneDigit(digit));

        String str = "123";
        System.out.println(isThreeDigits(str));
    }

    public static boolean isRed(String s){
        return s.matches("red");
    }

    public static boolean isRedOrGreen(String s){
        return s.matches("red | green");
    }

    public static boolean isOneDigit(String s){
        return s.matches("\\d");
    }

    public static boolean isNotOneDigit(String s){
        return s.matches("\\D");
    }

    public static boolean isOneWordChar(String s){
//        return s.matches("[a-zA-Z]]");
        return s.matches("\\w");
    }

    public static boolean isNotOneWordChar(String s){
        return s.matches("\\W");
    }

    public static boolean isWhiteSpace(String s){
        return s.matches("\\s");
    }
    public static boolean isNotWhiteSpace(String s){
        return s.matches("\\S");
    }

    public static boolean isAnySymbol(String s){
        return s.matches(".");
    }

    public static boolean isWholeString(String s){
        return s.matches("^.$");
    }

    /*
    *   . any char
    *   ^, $ αρχή και τέλος String
    *   [^] negation
    *   \d, \D digit, non-digit
    *   \w, \W a-ZA- Z0-0_ ,not
    *   \s, \S space, not space
    */

    public static boolean isZeroOrMoreDigits(String s){
        return s.matches("\\d*");
    }
    public static boolean isOneOrMoreDigits(String s){
        return s.matches("\\d+");
    }
    public static boolean isThreeDigits(String s){
        return s.matches("\\d{3}");
    }
    public static boolean isZeroToThreeDigits(String s){
        return s.matches("\\d{0,3}");
    }
    public static boolean isMoreThanFiveDigits(String s){
        return s.matches("\\d{5,}");
    }

    public static boolean isLessThanFiveDigits(String s){
        return s.matches("\\d{0,5}");
    }

    public static boolean isZeroOrOneAnySymbol(String s){
        return s.matches(".?");
    }

    public static boolean isValidEmailAddress(String s){ // athan@gmail.com
        return s.matches("^[a-zA-Z]]\\w*\\.?\\w+@\\w+\\.(com | gr)$");
    }
}

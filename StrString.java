package StString;

public class StrString {
    public static void AlphaUpper() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
    }
    public static void AlphaLower() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
    }
    public static void AlphaRussian() {
        for (char i = 'а'; i <= 'я'; i++) {
            System.out.print(i + " ");
        }
    }
    public static void Digits() {
        for (char i = '0'; i <= '9'; i++) {
            System.out.print(i + " ");
        }
    }
    public static void tableASCII(){
        for (char i = ' '; i <= '~'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}





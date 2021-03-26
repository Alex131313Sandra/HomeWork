package StString;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunFunction {
    //conversion function
    public static String IntegerToString(int value) {

        return Integer.toString(value);
    }

    public static String DoubleToString(double value) {

        return String.valueOf(value);
    }

    public static int StringToNumber(String value) {
        int x = Integer.parseInt(value);
        return x;
    }

    public static double StringToDouble(String value) {
        double y = Double.valueOf(value);
        //System.out.println(Double.parseDouble(x));
        return y;
    }


    //function work with strings

    public static int ReplaceCharacters(String value) {
        String[] words = value.split(" ");
        int min = words[0].length();
        for (int i = 1; i < words.length; i++) {
            min = Math.min(words[i].length(), min);
        }
        return min;
    }

    public static String ReplaceCharactersWithSymbols(String str, int quantity) {
        String[] words = str.split(" ");
        String res = " ";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == quantity) {
                res = words[i].substring(0, words[i].length() - 3);
                res = res + "$$$";
            }
        }
        return res;
    }

    public static String addSpaces(String value) {
        Pattern pattern = Pattern.compile("[\\pP\\W]");
        Matcher matcher = pattern.matcher(value);
        while(matcher.find()) {
            String w = matcher.group();
            value = value.replaceAll("\\" + w, w + " ");
            value = value.replaceAll("\\s+", " ");
        }
        return value;
    }

        public static String UniqueSymbol (String str){
            String result = " ";
            for (int i = 0; i < str.length(); i++) {
                if (result.indexOf(str.charAt(i)) == -1) {
                    result += str.charAt(i);
                }
            }
            return result;
        }

        public static int WordsAmount (String str){
            String[] words = str.split(" ");
            int quantity = 0;
            for (int i = 0; i < words.length; i++) {
                quantity++;
            }
            return quantity;
        }

        public static String deletePart (String string,int startInd, int SizeToDelete){
            return string.replace(string.substring(startInd, (startInd + SizeToDelete)), "");
        }

        public static String my_reverse (String str){
            StringBuilder string = new StringBuilder(str);
            string.reverse();
            return string.toString();
        }

        public static String deleteLastWord (String s){
            int amount = s.length();
            for (int i = amount - 1; i >= 0; i--) {
                if (s.charAt(i) == ' ') {
                    amount = i;
                    break;
                }
            }
            return s.substring(0, amount);
        }
    }






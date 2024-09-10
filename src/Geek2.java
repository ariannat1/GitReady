public class Geek2 {
    public static boolean find(String str, String match) { //Tests whether match is contained in str
        if(str.startsWith(match)) {
            return true;
        }
        else if(str.length() < match.length()) {
            return false;
        }
        return find(str.substring(1), match);
    }
    public static int digitSum(int n) { //Computes the sum of the digits of a number
        if (n == 0) {
            return 0;
        }
        return n % 10 + digitSum(n / 10);
    }
    public static int pow(int a, int n) { //Computes 𝑎𝑛, where 𝑛 is a positive integer.
        if (n == 0) {
            return 1;
        }
        return a * pow(a, n - 1);
    }
    public static int smallestDigit(int number) { //Finds the smallest digit in a number
        if (number < 10) {
            return number;
        }
         return smallestDigit(number / 10);
    }
    public static String reverse(String text) { //Reverses a string
        if (text.length() <= 1) {
            return text;
        }
        char one = text.charAt(0);
        String rev = text.substring(1);
        return reverse(rev) + one;
    }
}

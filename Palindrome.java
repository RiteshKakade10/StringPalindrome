import java.util.*;

public class Palindrome {
    public static String Check_Palindrome(String str1) {
        int n = str1.length();
        for (int i = 0; i < n / 2; i++) {
            if (str1.charAt(i) != str1.charAt(n - i - 1)) {
                return ("Not Palindrome");
            }
        }
        return "Palindrome";
    }

    public static void main(String[] args) {
        String str1 = "ritesh";
        System.out.println(Check_Palindrome(str1));
    }

}

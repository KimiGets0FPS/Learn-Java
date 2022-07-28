package LeetCode.Medium;


public class Palindromic_Substring {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        int current_length = s.length();
        while (current_length >= 1) {
            for (int i=0; i < s.length() - current_length; i++) {
                String substr = s.substring(i, i+current_length);
                StringBuilder opposite = new StringBuilder(substr);
                opposite.reverse();
                if (substr.equals(opposite.toString())) {
                    return substr;
                }
            }
            current_length -= 1;
        }
        return s;
    }
}

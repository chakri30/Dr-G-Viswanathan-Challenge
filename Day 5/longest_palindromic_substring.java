import java.util.*;
public class longest_palindromic_substring {
    public String LongestPalindrome(String s){
        if(s == null || s.length() < 1) return "";
        String LPS = "";
        for(int i = 1; i < s.length(); i++){
            int low = i;
            int high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == s.length()) break;
            }
            String palindrome = s.substring(low+1,high);
            if(palindrome.length() > LPS.length()){
                LPS = palindrome;
            }
            low = i - 1;
            high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == s.length()) break;
            }
            palindrome = s.substring(low + 1,high);
            if(palindrome.length() > LPS.length()){
                LPS = palindrome;
            }
        }
        return LPS;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        longest_palindromic_substring solution = new longest_palindromic_substring();
        String result = solution.LongestPalindrome(s);
        System.out.print(result);
    }
}


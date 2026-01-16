import java.util.*;
public class zigzagconversion {
    public String convert(String s, int numrows){
        String[] ans = new String[numrows];
        for(int i = 0; i < numrows; i++){
            ans[i] = "";
        }
        int i = 0;
        while(i < s.length()){
            for(int ind = 0; ind < numrows && i < s.length(); ind++){
                ans[ind] += s.charAt(i++);
            }
            for(int ind = numrows - 2; ind >= 1 && i < s.length(); ind--){
                ans[ind] += s.charAt(i++);
            }
        }
        String res = "";
        for(String str : ans){
            res += str;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int numrows = sc.nextInt();
        zigzagconversion solution = new zigzagconversion();
        String result = solution.convert(s,numrows);
        System.out.println(result);
    } 
}

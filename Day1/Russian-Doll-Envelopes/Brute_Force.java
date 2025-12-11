
import java.util.*;
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(a,b) -> a[0] - b[0]);
        int[] dp = new int[envelopes.length];
        int maxlength = 1;
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(envelopes[j][0] < envelopes[i][0] && envelopes[j][1] < envelopes[i][1]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            maxlength = Math.max(maxlength,dp[i]);
        }
        return maxlength;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] envelopes = new int[n][2];
        for(int i = 0; i < n; i++){
            envelopes[i][0] = sc.nextInt();
            envelopes[i][1] = sc.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.maxEnvelopes(envelopes);
        System.out.println(result);
    }
}

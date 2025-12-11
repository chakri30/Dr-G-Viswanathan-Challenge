import java.util.*;

public class Optimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] envelopes = new int[n][2];
        for (int i = 0; i < n; i++) {
            envelopes[i][0] = sc.nextInt();
            envelopes[i][1] = sc.nextInt();
        }
        int result = maxEnvelopes(envelopes);
        System.out.println(result);
    }

    public static int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int[] dp = new int[envelopes.length];
        int maxlength = 0;
        for (int i = 0; i < dp.length; i++) {
            int index = binarysearch(dp, 0, maxlength, envelopes[i][1]);
            dp[index] = envelopes[i][1];
            if (index == maxlength) {
                maxlength++;
            }
        }
        return maxlength;

    }

    public static int binarysearch(int[] arr, int start, int end, int target) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}


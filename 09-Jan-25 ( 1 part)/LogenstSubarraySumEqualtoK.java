import java.util.HashMap;

public class LogenstSubarraySumEqualtoK {
    // Optimal Approach for postive + zero values 
    // time complexity = 0(2N)
    
    public static void longestSubarray3(int[] arr, int n, long k) {

        int left = 0;
        int right = 0;
        int maxLen = 0;
        int sum = arr[0];

        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        System.out.println(maxLen);
    }

    // Better Approach for postive + Negative + zero values
    public static void longestSubarray2(int[] arr, int n, long k) {
        int len = 0;
        HashMap<Long, Integer> newmap = new HashMap<>();

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == k) {
                len = Math.max(len, i + 1);
            }

            // finding the previous remaing value like x-k;
            long rem = sum - k;

            if (newmap.containsKey(rem)) {
                len = Math.max(len, i - newmap.get(rem));
            }

            if (!newmap.containsKey(sum)) {
                newmap.put(sum, i);
            }

        }

        System.out.println("length : " + len);
    }

    // Brute force Approach
    public static void longestSubarray(int[] arr, int n, int k) {
        int len = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        System.out.println(len);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        // int arr[] ={2,3,5};
        int n = arr.length;
        long k = 6;
        longestSubarray3(arr, n, k);
    }
}

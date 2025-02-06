public class MaxSubArraySum {
    // Brute for approach
    public static void maxsubArraySum2(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += arr[j];
            }
            max = Math.max(currSum, max);
        }
        System.out.println(max);
    }

    // Kadane's Algorithm
    public static void maxsubArraySum(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            max = Math.max(currSum, max);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 7, 8 };

        int n = arr.length;
        maxsubArraySum2(arr, n);

    }
}

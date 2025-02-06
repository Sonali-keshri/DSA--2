
// We have many diffrent ways to solve this question like hashing, linear search, using (N*(N+1))/2 formula and last XOR approach
// I have used here linear search and using (N*(N+1))/2 formula 

public class MissingNumber {
    public static int missingNum2(int[] arr) {
        int n = 3;
        int totalSum = n * (n + 1) / 2;
        System.out.println("Total Sum  of " + n +" is " + totalSum);
        int arrSum = 0;
        for (int i : arr) {
            arrSum = arrSum + i;
        }
        System.out.println("Sum of Array " +arrSum);
        int finalSum = totalSum - arrSum;
        return finalSum;
    }

    public static int missingNum(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3 };
        int num = missingNum2(arr);
        // missingNum2(arr);
        System.out.println("Missing Num " +num);
    }
}

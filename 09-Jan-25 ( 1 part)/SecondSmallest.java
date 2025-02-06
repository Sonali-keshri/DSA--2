public class SecondSmallest {
    public static void secondsmallestEle(int[] arr, int n) {
        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                secMin = min;
                min = arr[i];
            } else if (arr[i] > min && arr[i] < secMin) {
                secMin = arr[i];
            }
        }
        System.out.println("Min :" + min);
        System.out.println("Sec Min :" + secMin);

    }

    public static void main(String[] args) {
        // int[] arr = {2,5,1,3,0};
        // int[] arr = { 8, 10, 5, 7, 9 };
        int[] arr = { 8 };
        int n = arr.length;

        secondsmallestEle(arr, n);

    }
}

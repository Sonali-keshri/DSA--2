public class SecondLargetele {
    public static int secondlargestEle(int[] arr, int n) {
        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            return -1; 
        }
        
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            }
            else if(arr[i] < max && arr[i]> secmax){
                secmax = arr[i];
            }
        }
        return secmax;
    }

    public static void main(String[] args) {
        // int[] arr = {2,5,1,3,0};
        int[] arr = { 8, 10, 5, 7, 9 };
        int n = arr.length;
        int res = secondlargestEle(arr, n);
        System.out.println("Second max element from array: " + res);
    }
}

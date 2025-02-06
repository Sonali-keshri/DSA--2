import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray2(int[] arr, int n) {
            for(int i = n-1 ; i<=0 ; i--){
                arr[n-i-1]= arr[i];
            }
            return arr;

    }
   public static int[] reverseArray(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
    }
    return arr;
}

public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int arrlen = arr.length;

    System.out.println(Arrays.toString(arr));
    arr = reverseArray(arr);
    // System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(reverseArray2(arr, arrlen)));
}

}

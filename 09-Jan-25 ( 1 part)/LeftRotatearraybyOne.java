import java.util.Arrays;

public class LeftRotatearraybyOne {

    public static int[] leftRotate(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr =  {43,23,5,2,6};
        System.out.println(Arrays.toString(leftRotate(arr)));
    }

}

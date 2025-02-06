import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort2(int[] array) {
        int n = array.length;
        for (int i = 1; i <= n - 1; i++) {
            int curr = array[i];
            int prev = i - 1;
            while (prev >= 0 && array[prev] > curr) {
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev + 1] = curr;

        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i <= n - 1; i++) {

            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j = j - 1;
            }

        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = { 13, 32, 26, 35, 10 };
        int[] res = insertionSort2(arr);
        System.out.println(Arrays.toString(res));
    }
}

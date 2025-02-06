// Bubble Sort works by repeatedly stepping through the list, comparing adjacent elements, and swapping them if they are in the wrong order. The pass through the list is repeated until the list is sorted. The name "Bubble Sort" comes from the way smaller elements bubble to the top of the list during each pass.

// In BubbleSort find swap two adjacent numeber and push the bigger number to end of the array . 
// Time compelexity - Worst & avg O(n^2) , avg O(N), Space complexity - O(1)

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            Boolean isSwap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                return arr;
            }
        }
        return arr;
    }

    public static int[] bubbleSort2(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 1; i--) {
            Boolean isSwap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 13, 32, 26, 35, 10 };
        int[] res = bubbleSort2(arr);
        System.out.println(Arrays.toString(res));
    }
}

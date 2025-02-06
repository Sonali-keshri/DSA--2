


public class Sort_0_1_2 {

    public static void sort(int[] arr, int n) {
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countZero++;
            } else if (arr[i] == 1) {
                countOne++;
            } else if (arr[i] == 2) {
                countTwo++;
            }
        }
        int i =0;
        while (i < countZero) {
            arr[i++] = 0;
            
        }
        int j = 0;
        while (j < countOne) {
            arr[i++] = 1;
            j++;
        }
        int k = 0;
        while (k < countTwo) {
            arr[i++] = 2;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        int n = arr.length;
        sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
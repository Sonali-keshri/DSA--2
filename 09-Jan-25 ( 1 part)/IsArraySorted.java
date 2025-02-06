public class IsArraySorted {

    public static Boolean isArraySorted2(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean isArraySorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int array[] = { 20, 22, 19, 23 };
        // int array[] = { 1,2,3,4,5};
        int n = array.length;
        Boolean res= isArraySorted2(array, n);
        System.out.println(res);
    }
}

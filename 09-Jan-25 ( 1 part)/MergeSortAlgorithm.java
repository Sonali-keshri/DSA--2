import java.util.ArrayList;

public class MergeSortAlgorithm {
    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low, right = mid + 1;
        ArrayList<Integer> newlist = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                newlist.add(arr[left]);
                left++;
            } else {
                newlist.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            newlist.add(arr[left]);
            left++;
        }
        while (right <= high) {
            newlist.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = newlist.get(i - low);
        }

    }

    public static void mergeSort(int[] arr, int low, int high) {

        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4, 1, 5, 6, 2, 4 };
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
        }
    }
}
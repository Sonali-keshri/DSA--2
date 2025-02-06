public class QuickSortAlgo {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;
        
        while (i < j) {
            // Find an element greater than the pivot from the left
            while (arr[i] <= pivot && i < high) {
                i++;
            }

            // Find an element smaller than the pivot from the right
            while (arr[j] > pivot && j > low) {
                j--;
            }

            // Swap elements if i < j
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot element in the correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; 
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high); 
            quicksort(arr, low, pivot - 1); 
            quicksort(arr, pivot + 1, high); 
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
        quicksort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

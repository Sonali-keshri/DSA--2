public class LargestElementinArr {
    public static int largestEle(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i< n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // int[] arr = {2,5,1,3,0};
        int[] arr = {8,10,5,7,9};
        int n = arr.length;
        int res = largestEle(arr, n);
        System.out.println("max element from array: " + res);
    }
}

// Brute force using linear Searching method
// Better Using Hashmap 

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static String twosumbypointers(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
   
        while (left<right) {
            int sum = arr[left] + arr[right];
            if(sum == k){
                return "Yes";
            }else if(sum > k){
                right--;
            }else{
                left++;
            }
        }
        return "NO";
    }

    public static int[] twosumIndex(int[] arr, int n, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] indexArr = new int[2];
        indexArr[0] = indexArr[1] = -1;

        for (int i = 0; i < n; i++) {
            int currNum = arr[i];
            int rem = k - currNum;
            if (map.containsKey(rem)) {
                indexArr[0] = map.get(rem);
                indexArr[1] = i;
            } else {
                map.put(currNum, i);
            }
        }
        return indexArr;
    }

    public static String twosum(int[] arr, int n, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int currNum = arr[i];
            int rem = k - currNum;
            if (map.containsKey(rem)) {
                return "Yes";
            } else {
                map.put(currNum, i);
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int k = 14;
        int n = arr.length;

        String res = twosumbypointers(arr, n, k);
        System.out.println(res);
        // for (int i = 0; i < res.length; i++) {
        //     System.out.print(res[i] + " ");
        // }

    }
}

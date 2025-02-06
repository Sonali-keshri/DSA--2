// Find the number that appears once, and the other numbers twice
// For ways to solve this
// Brute force -linear
// better - Hashmap 
// better - Hashing 
// Optimal - XOR 

import java.util.HashMap;
import java.util.Map;

public class NumAppearedOnce {

    // XOR
    public static int gettheNum3(int[] arr, int n) {

        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }

    // HashMap
    public static int gettheNum2(int[] arr, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // for(int j =0; j<n;j++){
        // if(map.get(arr[j])==1){
        // return arr[j];
        // }
        // }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        return -1;

    }

    // Linear
    public static int gettheNum(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (num == arr[j]) {
                    count++;
                }
            }
            if (count < 2) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 4, 2 };
        int res = gettheNum3(nums, nums.length);
        System.out.println(res);

    }
}
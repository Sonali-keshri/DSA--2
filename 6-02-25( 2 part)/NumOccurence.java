import java.util.HashMap;
public class NumOccurence {

    // Brute force approche
    public static int numOccur(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i];
            }
        }
        return 0;
    }

    // Using HashMap Better approach
    public static void numOccur2(int[] nums, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        map.forEach((key, value) ->{
            if (value > n / 2) {
                System.out.println(key + " = " + value);
            }
        });
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int n = nums.length;
        // System.out.println(n/2);
        int res = numOccur(nums, n);
        // System.out.print(res);
        numOccur2(nums, n) ;
    }
}


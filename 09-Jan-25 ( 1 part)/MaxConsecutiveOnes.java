public class MaxConsecutiveOnes {
    public static void maxConsuOnes(int[] arr) {
        int count = 0;
        int maxConsecutive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }else{
                count = 0;
            }
            maxConsecutive = Math.max(maxConsecutive, count);
        }
        System.out.println(maxConsecutive);
    }

    public static void main(String[] args) {
        int[] nums ={1, 0, 1, 1, 0, 1} ;

        maxConsuOnes(nums);
    }
}
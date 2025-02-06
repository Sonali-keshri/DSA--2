import java.util.*;

public class MoveAllZeros {

    // Brute Force Approach
    public static int[] moveZeros(int[] arr) {

        ArrayList<Integer> nonZeroList = new ArrayList<>();

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                nonZeroList.add(arr[i]);
            }
        }
        for (int i = 0; i < nonZeroList.size(); i++) {
            result[i] = nonZeroList.get(i);

        }

        return result;

    }
    // Optimal One
    public static int[] moveZeros2(int[] arr) {

        //finidng the first zero
        int j = -1;
        for(int  i=0; i<arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        // if there is no zero
        if(j == -1){
            return arr;
        }
        for(int i = j + 1; i < arr.length ; i++ ){
            if(arr[i] != 0){
                int temp  =  arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
        int[] res = moveZeros2(arr);
        System.out.println(Arrays.toString(res));

    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FindUnion {

    // Using HashMap
    public static ArrayList<Integer> findUnion2(int[] arr1, int[] arr2) {

        HashMap<Integer,Integer> newHasmap =  new HashMap<>();
        
        ArrayList<Integer> union = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            newHasmap.put(arr1[i], newHasmap.getOrDefault(arr1[i], 0)+1);
        } 
        for (int i = 0; i < arr2.length; i++) {
            newHasmap.put(arr2[i], newHasmap.getOrDefault(arr2[i], 0)+1);
        } 
        for (int key : newHasmap.keySet()) {
            union.add(key);
        }
        return union;
    }
    // Using HashSet
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {

        HashSet<Integer> newSet = new HashSet<>();

        ArrayList<Integer> union = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            newSet.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            newSet.add(arr2[i]);
        }
        for (int num : newSet) {
            union.add(num);
        }
        return union;

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        System.out.println(findUnion2(arr1, arr2));
    }
}
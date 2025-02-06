

// Using hashset we can also solve this
// below one is using two pointers approach which is optimal 

public class RemoveDupInplace {
    public static int removeDup(int[] arr){
        int i = 0;
        int j = 1;
        while ( j < arr.length){ // we can also use for loop here to run the j from 1 to n-1;
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        return i+1; // return the length of the array without duplicates
       
    }
    public static void main(String[] args) {
        // int arr[] = {1,1,2,2,2,3,3};
        int arr[] = {1,1,1,2,2,3,3,3,3,4,4};
        
        System.out.println("Try programiz.pro");
        int res = removeDup(arr);
            System.out.println(res);
        for(int i = 0; i < res; i++){
                System.out.print(arr[i] + " ");
        }
    }
}
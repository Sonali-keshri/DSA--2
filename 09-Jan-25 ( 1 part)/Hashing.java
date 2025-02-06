public class Hashing {

    public static void hashingCharfunc(String str, String strquriesArr, int strQ) {
        int n = str.length();

        // precompute
        int hash[] = new int[256];
        for (int i = 0; i < n; i++) {
            hash[str.charAt(i)]++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        // Process queries
        for (int i = 0; i < strQ; i++) {
            int query = strquriesArr.charAt(i);
            char c =  strquriesArr.charAt(i);
            if (query < hash.length) {
                System.out.println("Count of " + c + ": " + hash[query]);
            } else {
                System.out.println("Count of " + c + ": 0");
            }
        }
    }


    public static void hashingNumber(int[] arr, int[] quriesArr, int q) {
        int n = arr.length;

        // precompute
        int hash[] = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Process queries
        for (int i = 0; i < q; i++) {
            int query = quriesArr[i];
            if (query < hash.length) {
                System.out.println("Count of " + query + ": " + hash[query]);
            } else {
                System.out.println("Count of " + query + ": 0");
            }
        }
    }

    public static int hashingNumber2(int[] arr, int num) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 3 };
        int[] quriesArr = { 1, 4, 2, 3, 12 };
        int q = 5;
        // hashingNumber(arr, quriesArr, q);
        
        String str= "abcdabehf";
        int strQ= 5;
        String strQuriesArr = "aghbc";
        hashingCharfunc(str, strQuriesArr,strQ);
    }
}

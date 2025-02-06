public class PrintNnaturals {

    public static int printNnatural( int n) {
        if (n == 0) {
            return 0;
        }
        return n + printNnatural(n - 1);
}


    // Recursive Way
    public static void printNnaturals(int sum, int n) {

        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum = sum + 1;
        n = n - 1;
        printNnaturals(sum, n);

    }

    public static void main(String[] args) {
        int n = 5;
        // System.out.println(n *(n+1)/2);
        // printNnaturals(0, n);
       System.out.println( printNnatural( n));
    }
}
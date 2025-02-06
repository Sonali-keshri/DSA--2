public class PrimeNumber {

    public static void primeNumber(int n) {
        // Handling edge cases
        if (n <= 1) {
            System.out.println(n + " Is not a prime number");
            return;
        }
        if (n == 2) {
            System.out.println(n + " Is a prime number");
            return;
        }
        if (n % 2 == 0) {
            System.out.println(n + " Is not a prime number");
            return;
        }

        // Loop from 3 to sqrt(n), check only odd numbers
        for(int i = 3; i <= Math.sqrt(n); i++){ 
            if (n % i == 0) {
                System.out.println(n + " Is not a prime number");
                return;
            }
        }

        System.out.println(n + " Is a prime number");
    }

    public static void main(String[] args) {
        int n = 17;  // Test case
        primeNumber(n);
    }
}

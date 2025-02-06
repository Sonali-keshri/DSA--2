public class palindrome_number {
    public static int reverseDigits(int n) {
        int rev = 0;

        while (n > 0) {

            rev = rev * 10 + n % 10;
            n = n / 10;

        }
        return rev;
    }

    public static boolean palindromeNumber(int n) {
        int revDigs = reverseDigits(n);
        if (revDigs == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 123213;
        System.out.println(palindromeNumber(n));

    }
}

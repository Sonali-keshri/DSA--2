public class ArmstrongNum {
    public static int countDigits(int n) {
        // Write your code here.
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void armstrongNumber(int n) {
        int power = countDigits(n);
        int dupN = n;
        int sum = 0;
        while (dupN > 0) {

            int rem = dupN % 10;
            dupN = dupN / 10;
            sum = sum + (int) Math.pow(rem, power);
        }
        if (sum == n) {

            System.out.println(true);
        }else{
            System.out.println(false);

        }
    }

    public static void main(String[] args) {
        int n = 1532;
        armstrongNumber(n);

    }
}
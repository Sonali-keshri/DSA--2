public class countdigits {
    public static int countDigits(int n){
        // Write your code here.
        int count = 0;
        int num = n;
        while(num > 0){
            num = num/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(countDigits(n));

        // Optmized way 
        int cnt = (int) (Math.log10(n) + 1);
        System.out.println("Number of Digits in N: " + cnt);
    }
}

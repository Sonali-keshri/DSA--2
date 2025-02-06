import java.util.ArrayList;

public class GCD_of_two_numbers {

    public static void gcd_OfTwoNumbers(int a, int b) {
        ArrayList<Integer> factorA = new ArrayList<>();
        ArrayList<Integer> factorB = new ArrayList<>();
        ArrayList<Integer> commonFactor = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                factorA.add(i);
            }
        }
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                factorB.add(i);
            }
        }
        System.out.println(factorA);
        System.out.println(factorB);
        // int s = factorA.size() < factorB.size() ? factorA.size() : factorB.size();
        for (int i : factorA) {
            if (factorB.contains(i)) {
                commonFactor.add(i);
            }
        }

        System.out.println("Common Factors: " + commonFactor);
        // Find the greatest common factor
        int gcd = commonFactor.isEmpty() ? 0 : commonFactor.get(commonFactor.size() - 1);
        System.out.println("GCD: " + gcd);
    }

    public static void gcd_OfTwoNumbers2(int a, int b) {
        int gcd = 1;
        for (int i = 1;  i<= Math.min(a, b); i++) {
               if( a % i == 0 && b % i == 0) {
                gcd = i;
               }
        }
        System.out.println("GCD: " + gcd);
    }

    // public static void gcd_OfTwoNumbers3(int a, int b) {

    // }
    public static void main(String[] args) {
        int n1 =20;
        int n2 = 16;
        // gcd_OfTwoNumbers(n1, n2);
        gcd_OfTwoNumbers2(n1, n2);
        // System.out.println(gcd_OfTwoNumbers(n1, n2));

    }
}
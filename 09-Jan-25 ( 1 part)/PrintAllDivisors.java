import java.util.ArrayList;

public class PrintAllDivisors {
    public static void printAllDivisors(int n) {
        ArrayList<Integer> factorsN = new ArrayList<>(); 
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorsN.add(i);
            }
        }
        System.out.println(factorsN);
    }
    public static void main(String[] args) {
        int n = 12;
        printAllDivisors(n);
    }
}

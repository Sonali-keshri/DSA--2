public class FibonacciSeries {

    public static void fib(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        int c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void fib2(int a, int b, int c,  int n) {
    
        // int a = 0, b = 1;
        // System.out.print(a + " " + b + " ");
       
        if( c == n){
            return;
        }
        c = a + b;
        a= b;
        b= c;
        System.out.print(c + " " );
        fib2(a, b, c, n-1);

    }

    public static void main(String[] args) {
        int n = 5;
        int a = 0, b = 1;
        fib(n);
        System.out.println("\n");
        System.out.print(a + " " + b + " ");
        fib2(a, b , 0, n);

    }
}
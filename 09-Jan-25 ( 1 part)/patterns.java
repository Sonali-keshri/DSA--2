public class patterns {

    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 1
    // 12
    // 123
    // 1234
    // 12345
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // 1
    // 22
    // 333
    // 4444
    // 55555
    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // *****
    // ****
    // ***
    // **
    // *
    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 12345
    // 1234
    // 123
    // 12
    // 1
    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");

                }
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");

                }
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }

            System.out.println();
        }
    }

    // Inveeted pattern
    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      
    }

    public static void main(String args[]) {
        int num = 5;
        // pattern1(num);
        pattern12(num);

    }
}
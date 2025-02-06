import java.util.ArrayList;

public class RearrangebySign {
    // only when neg and pos digits are same
    public static void arrangeAlternateSign2(int[] arr, int n) {

        int posIdx = 0, negIdx = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[negIdx] = arr[i];
                negIdx = negIdx + 2;
            } else {
                arr[posIdx] = arr[i];
                posIdx = posIdx + 2;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        ;

    }

    public static void arrangeAlternateSign(int[] arr, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos.add(arr[i]);

            } else {
                neg.add(arr[i]);
            }
        }
        ;
        for (int i = 0; i < pos.size(); i++) {
            arr[i * 2] = pos.get(i);
        }
        ;
        for (int i = 1; i < neg.size(); i++) {

            arr[i * 2 - 1] = neg.get(i);
        }
        ;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        ;

    }

    public static void main(String[] args) {
        int[] arr = { 1, -1, 2, -2, 3 };
        int n = arr.length;
        arrangeAlternateSign2(arr, n);
    }
}

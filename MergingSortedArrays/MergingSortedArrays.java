import java.util.Scanner;
import java.util.Arrays;

public class MergingSortedArrays {

    public static void main(String[] args) {
        int[] a1 = {0};
        int[] a2 = {-54, 0, 1,};
        System.out.println(Arrays.toString(a1) + " " + Arrays.toString(a2));
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length) {
            res[k++] = a1[i] < a2[j] ? a1[i++] : a2[j++];
        }
        if (i < a1.length) {
            System.arraycopy(a1, i, res, k, a1.length - i);
        } else if (j < a2.length) {
            System.arraycopy(a2, j, res, k, a2.length - j);
        }
        return res;
    }
}
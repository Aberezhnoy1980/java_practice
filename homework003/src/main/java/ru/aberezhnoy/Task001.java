package ru.aberezhnoy;

import java.util.Arrays;

public class Task001 {
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }

    static class MergeSort {
        public static int[] mergeSort(int[] a) {
            if (a == null) {
                return null;
            }
            if (a.length < 2) {
                return a;
            }
            int[] b = new int[a.length / 2];
            System.arraycopy(a, 0, b, 0, a.length / 2);

            int[] c = new int[a.length - b.length];
            System.arraycopy(a, b.length, c, 0, a.length - b.length);

            mergeSort(b);
            mergeSort(c);

            int bPos = 0;
            int cPos = 0;

            for (int i = 0; i < a.length; i++) {
                if (bPos == b.length) {
                    a[i] = c[cPos];
                    cPos++;
                } else if (cPos == c.length) {
                    a[i] = b[bPos];
                    bPos++;
                } else if (b[bPos] < c[cPos]) {
                    a[i] = b[bPos];
                    bPos++;
                } else {
                    a[i] = c[cPos];
                    cPos++;
                }
            }
            return a;
        }
    }
}

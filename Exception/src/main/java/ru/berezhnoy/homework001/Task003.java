package ru.berezhnoy.homework001;

import java.util.Arrays;

public class Task003 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 0};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }

    public static class Answer {
        public int[] divArrays(int[] a, int[] b) {
            int[] result = new int[a.length];
            if (a.length == b.length) {
                for (int i = 0; i < a.length; i++) {
                    try {
                        result[i] = a[i] / b[i];
                    } catch (RuntimeException e) {
                        throw new RuntimeException("Dividing by zero");
                    }
                }
                return result;
            }
            return new int[1];
        }
    }
}


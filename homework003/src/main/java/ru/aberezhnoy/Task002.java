package ru.aberezhnoy;

import java.util.Arrays;

public class Task002 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{2, 4, 6, 8};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.removeEvenNumbers(arr);
    }

    static class Answer {
        public static void removeEvenNumbers(Integer[] arr) {
            // Введите свое решение ниже
            int resLength = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    resLength++;
                }
            }
            int[] res = new int[resLength];
            for (int j = 0, k = 0; j < arr.length; j++) {
                if (arr[j] % 2 != 0) {
                    res[k] = arr[j];
                    k++;
                }
            }
            System.out.println(Arrays.toString(res));
        }
    }
}

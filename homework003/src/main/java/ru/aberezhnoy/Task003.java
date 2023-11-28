package ru.aberezhnoy;

import java.util.Arrays;

public class Task003 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }

    static class Answer {
        public static void analyzeNumbers(Integer[] arr) {
            // Введите свое решение ниже
            int sum = 0;
            int max = arr[0];
            int min = arr[0];

            for (int i = arr.length - 1; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if (arr[i] > max) max = arr[i];
                if (arr[i] < min) min = arr[i];
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("Minimum is " + min);
            System.out.println("Maximum is " + max);
            System.out.println("Average is =" + sum/arr.length);

        }
    }
}

package ru.berezhnoy.seminar002;

public class Task002 {
    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3"}, {"4", "5", "6"}, {"i", "kaka", "12"}}; // 33

        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        int val;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    val = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException | NullPointerException e) {
                    val = 0;
                }
                sum += val;
            }
        }
        return sum;
    }
}


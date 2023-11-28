package ru.aberezhnoy;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String... args) {

//        task0();
//        task1();
//        task2();
//        task3();
        task4(2, 0);
    }


    static void task0() {
        System.out.println("What's your name?");
        String name = sc.nextLine();
        int currentTime = LocalTime.now().getHour();
        if (currentTime >= 5 && currentTime < 12) {
            System.out.println("Good morning " + name);
        } else if (currentTime >= 12 && currentTime < 18) {
            System.out.println("Good day " + name);
        } else if (currentTime >= 18 && currentTime < 23) {
            System.out.println("Good evening " + name);
        } else
            System.out.println("Good night " + name);
        sc.close();
    }

    static void task1() {
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1};
        int count = 0;
        int maxOnes = 0;
        for (int j : arr) {
            if (j == 1) {
                count++;
                if (count > maxOnes) {
                    maxOnes = count;
                }
            } else count = 0;
        }
        System.out.println(maxOnes);
    }

    /*Текст задачи:
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
а остальные - равны ему.*/
    static void task2() {
        int[] nums = {3, 2, 2, 3, 3, 2, 3};
        int val = 3;
        int[] temp = new int[nums.length];
        Arrays.fill(temp, val);
        int index = 0;
        for (int i = 1, j = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                temp[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }

    static void task3() {
        String str = "Wellcome to java course".toLowerCase();
        String[] arr = str.split("\\s");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    static void task4(int a, int b) {
        double res = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            if (b == 0) res = 1;
            else if (b < 0) res = 1 / a;
            res *= a;
        }
        System.out.println(res);
    }
}

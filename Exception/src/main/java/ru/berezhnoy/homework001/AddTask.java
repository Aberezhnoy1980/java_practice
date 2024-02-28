package ru.berezhnoy.homework001;

import java.util.Arrays;

public class AddTask {
    public static void main(String[] args) {
        int[][] twins = {{1, 2, 3, 4}, {5, 6, 7}, {9, 10, 11}, {13}};

//        System.out.println(twins[0].length);
//        System.out.println(twins[1].length);
//        System.out.println(twins[2].length);
//        System.out.println(twins[3].length);
//
        printArray(twins);
//        System.out.println(compareRowAndColumnLength(twins));

    }

    public static boolean compareRowAndColumnLength(int[][] twins) {
        for (int i = 0; i < twins.length; i++) {
            int columnLength = 0;
            int rowLength = twins[i].length;
            for (int j = 0; j < twins[i].length; j++) {

            }
        }
        return true;
    }

    public static void printArray(int[][] twins) {
        for (int i = 0; i < twins.length; i++) {
            for (int j = 0; j < twins[i].length; j++) {
                System.out.print(twins[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

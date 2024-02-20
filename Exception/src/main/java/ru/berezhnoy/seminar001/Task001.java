package ru.berezhnoy.seminar001;

public class Task001 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        int[] otherInts = {1, 2, 3, 4, 5};
        printResult(checkArray(ints, 3, 6));
        System.out.println("==============");
        printResult(checkArray(null, 3, 6));
        System.out.println("==============");
        printResult(checkArray(otherInts, 7, 6));
        System.out.println("==============");
        printResult(checkArray(otherInts, 3, 5));
    }

    public static int checkArray(int[] ints, int min, int searchElement) {
        int errCode = -2;
        if (ints == null) return errCode = -3;
        if (ints.length < min) return errCode = -1;
        for (int i = 0; i < ints.length; i++) {
            if (searchElement == ints[i]) {
                return errCode = i;
            }
        }
        return errCode;
    }

    public static void printResult(int errCode) {
        switch (errCode) {
            case -1:
                System.out.println("Array length less than min value");
                break;
            case -2:
                System.out.println("Element not found");
                break;
            case -3:
                System.out.println("Array is empty");
                break;
            default:
                System.out.println("Search element index " + errCode);
                break;
        }
    }
}

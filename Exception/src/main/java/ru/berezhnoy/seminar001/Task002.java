package ru.berezhnoy.seminar001;

public class Task002 {
    public static void main(String[] args) {
        int[][] beInts = {{1, 2, 3}, {1, 2, 3}};
        int[][] otherBeInts = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] anotherBeInts = {{1, 0, 0}, {1, 1, 1}, {0, 0, 1}};

//        getSumArrayElements(beInts);
//        getSumArrayElements(otherBeInts);
//        getSumArrayElements(null);
        System.out.println(getSumArrayElements(anotherBeInts));
    }

    public static int getSumArrayElements(int[][] beInts) {
        int sum = 0;
        if (beInts == null) throw new RuntimeException("Array is empty");
        if (beInts.length != beInts[0].length) throw new RuntimeException("Array is not square");
        for (int i = 0; i < beInts.length; i++) {
            for (int j = 0; j < beInts[0].length; j++) {
                if (beInts[i][j] != 0 && beInts[i][j] != 1)
                    throw new RuntimeException("Wrong elements");
                sum += beInts[i][j];
            }
        }
        return sum;
    }
}

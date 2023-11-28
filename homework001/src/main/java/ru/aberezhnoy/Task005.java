package ru.aberezhnoy;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Task005 {
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("homework001/log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class BubbleSort {
        private static File log;
        private static FileWriter fileWriter;

        public static void sort(int[] mas) {
            log = new File("homework001/log.txt");
            try {
                fileWriter = new FileWriter(log);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            DateFormat df = new SimpleDateFormat("YYYY-MM-dd hh:mm");
            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] > mas[i + 1]) {
                        isSorted = false;

                        buf = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = buf;
                    }
                }
                try {
                    fileWriter.write(df.format(new Date().getTime()) + " " + Arrays.toString(mas) + "\n");
                    fileWriter.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
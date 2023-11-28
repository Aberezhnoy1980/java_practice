package ru.aberezhnoy;

public class Task001 {
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 4;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
//        Answer ans = new Answer();
        int itresume_res = Answer.countNTriangle(5);
        System.out.println(itresume_res);

    }

    private static  class Answer {

        public Answer() {
        }

        static int countNTriangle(int n) {
            return (int) (0.5 * n * (n + 1));
        }

    }
}

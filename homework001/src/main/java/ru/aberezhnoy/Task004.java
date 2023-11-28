package ru.aberezhnoy;

import java.util.Objects;

public class Task004 {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }
//
        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }

    static class Answer {
        public static StringBuilder answer(String QUERY, String PARAMS) {
            StringBuilder answer = new StringBuilder();
            String[] params = PARAMS.replaceAll("[{}]|\\s", "").split(",");
            answer.append(QUERY);
            int count = 0;
            for (int i = 0; i < params.length; i++) {
                if (!Objects.equals(params[i].split(":")[1], "\"null\"")) {
                    count++;
                    if (count != 1)
                        answer.append(" and ")
                                .append(params[i].split(":")[0].replaceAll("\"", ""))
                                .append("=")
                                .append(params[i].split(":")[1].replaceAll("\"", "\'"));
                    else
                        answer.append(params[i].split(":")[0].replaceAll("\"", ""))
                                .append("=")
                                .append(params[i].split(":")[1].replaceAll("\"", "\'"));
                }
//                if (i == params.length - 1) answer.append("\b\b\b\b\b");
            }
            return answer;
        }
    }
}

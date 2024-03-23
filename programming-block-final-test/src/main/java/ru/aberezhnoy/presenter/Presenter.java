package ru.aberezhnoy.presenter;

import ru.aberezhnoy.handler.TextHandler;

import java.util.Map;

public class Presenter {
    private final Map<String, Integer> tokens;

    public Presenter() {
        this.tokens = new TextHandler().getTokens();
    }

    public void getTokens() {
        System.out.println(tokens.keySet());
    }

    public int getWordCount() {
        return tokens.values().stream().reduce(0, Integer::sum);
    }

    public String findTheLongestWord() {
        String max = "";
        for (String s : tokens.keySet()) {
            if (s.length() > max.length()) max = s;
        }

        return max;
//        return tokens.keySet().stream().max((s1, s2) -> s2.length() - s1.length()).orElseThrow();
    }

    public void getWordFrequency() {
        for (Map.Entry<String, Integer> entry : tokens.entrySet()) {
            System.out.printf("The word %s arrears %d times%n", entry.getKey(), entry.getValue());
        }
    }
}

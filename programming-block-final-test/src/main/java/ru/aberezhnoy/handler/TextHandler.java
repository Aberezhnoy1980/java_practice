package ru.aberezhnoy.handler;

import ru.aberezhnoy.model.TextRepository;

import java.util.*;

public class TextHandler {
    private final TextRepository textRepository;

    public TextHandler() {
        this.textRepository = new TextRepository();
    }

    public Map<String, Integer> getTokens() {
        Map<String, Integer> tokens = new HashMap<>();
        List<String> stringTokens = new ArrayList<>(List.of(textRepository.getText().trim().split("[^A-Za-zА-Яа-я]+")));
        stringTokens.removeIf(s -> s.equals(""));
        for (String stringToken : stringTokens) {
            if (tokens.containsKey(stringToken)) {
                tokens.put(stringToken, tokens.get(stringToken) + 1);
//                tokens.replace(stringTokens[i], tokens.get(stringTokens[i]) + 1);
            } else
                tokens.put(stringToken, 1);
        }
        return tokens;
    }
}

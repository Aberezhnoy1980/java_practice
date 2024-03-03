package ru.aberezhnoy.compnumcalc.util;

import java.util.Arrays;

public class Draft {
    public static void main(String[] args) {
        String expression = "23 + 56i";
        System.out.println(Arrays.toString(getTokens(expression)));

    }

    public static int[] getTokens(String expression) {
        String[] expTokens = expression.replace("i", "").replaceAll("\\s+", "").split("[-+]");
        int[] tokens = new int[2];
        tokens[0] = expression.startsWith("-") ? Integer.parseInt(expTokens[1]) * -1 : Integer.parseInt(expTokens[0]);
        if (expression.startsWith("-")) {
            tokens[1] = expTokens.length != 3 ? 1 : Integer.parseInt(expTokens[2]);
            if (expression.charAt(expTokens[1].length() + 2) == '-') tokens[1] = expTokens.length != 3 ? -1 : Integer.parseInt(expTokens[2]) * -1;
        } else {
            tokens[1] = expTokens.length != 2 ? 1 : Integer.parseInt(expTokens[1]);
            if (expression.charAt(expTokens[0].length() + 1) == '-') tokens[1] = expTokens.length != 2 ? -1 : Integer.parseInt(expTokens[1]) * -1;
        }
        return tokens;
    }
}

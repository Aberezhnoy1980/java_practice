package ru.aberezhnoy.compnumcalc.model;

public class ComplexNumber {
    //    private final String expression;
    private int real;
    private int imaginary;
    char[] expTokens;
    int[] tokens;

    public ComplexNumber(String expression) {
        this.expTokens = expression.replaceAll("\\s+", "").toCharArray();
        this.tokens = new int[2];
    }

    private int[] getTokens() {
        if (expTokens[0] == '-') {
            tokens[0] = Integer.parseInt(String.valueOf(expTokens[1])) * -1;
            if (expTokens[2] == '-') {
                tokens[1] = Integer.parseInt(String.valueOf(expTokens[3])) * -1;
            } else tokens[1] = Integer.parseInt(String.valueOf(expTokens[3]));
        } else {
            tokens[0] = Integer.parseInt(String.valueOf(expTokens[0]));
            if (expTokens[1] == '-') {
                tokens[1] = Integer.parseInt(String.valueOf(expTokens[2])) * -1;
            } else tokens[1] = Integer.parseInt(String.valueOf(expTokens[2]));
        }
        return tokens;
    }

    public int getRealPart() {
        return getTokens()[0];
    }

    public int getImaginaryPart() {
        return getTokens()[1];
    }
}

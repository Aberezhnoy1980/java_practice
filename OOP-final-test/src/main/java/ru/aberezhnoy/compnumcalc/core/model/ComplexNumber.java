package ru.aberezhnoy.compnumcalc.core.model;

public class ComplexNumber {
    private final int realPart;
    private final int imaginaryPart;
    private final String expression;
    String[] expTokens;
    int[] tokens;

    public ComplexNumber(String expression) {
        this.expression = expression;
        this.expTokens = expression.replace("i", "").replaceAll("\\s+", "").split("[-+]");
        this.tokens = new int[2];
        this.realPart = getTokens()[0];
        this.imaginaryPart = getTokens()[1];
    }

    private int[] getTokens() {
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

    public int getRealPart() {
        return realPart;
    }

    public int getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public String toString() {
        return expression;
    }
}

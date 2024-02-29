package ru.aberezhnoy.compnumcalc.model;

public interface Model {
    String result();

    void setFirstArg(ComplexNumber complexNumber);

    void setSecondArg(ComplexNumber complexNumber);
}

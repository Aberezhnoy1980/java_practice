package ru.aberezhnoy.compnumcalc.core.model;

public interface Model {
    String getResult();

    void setFirstArg(ComplexNumber complexNumber);

    void setSecondArg(ComplexNumber complexNumber);
}

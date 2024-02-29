package ru.aberezhnoy.compnumcalc.model.impl;

import ru.aberezhnoy.compnumcalc.model.ComplexNumber;
import ru.aberezhnoy.compnumcalc.model.Model;

public class SumModel extends CalcModel {

    public SumModel() {
    }
    @Override

    public String result() {
        return null;
    }

    @Override
    public void setFirstArg(ComplexNumber complexNumber1) {
        super.firstArgument = complexNumber1.getRealPart();
    }

    @Override
    public String setSecondArg(int value) {
        return null;
    }
}

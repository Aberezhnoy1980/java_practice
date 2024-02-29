package ru.aberezhnoy.compnumcalc.core.model.impl;

import ru.aberezhnoy.compnumcalc.core.model.ComplexNumber;

public class SubModel extends CalcModel {
    public SubModel() {
    }
    @Override
    public String getResult() {
        String firstToken = String.valueOf(firstArgument.getRealPart() - secondArgument.getRealPart());
        String secondToken = (firstArgument.getImaginaryPart() - secondArgument.getImaginaryPart()) < 0 ? "-" : "+";
        String thirdToken;
        if (firstArgument.getImaginaryPart() - secondArgument.getImaginaryPart() < 0)
            thirdToken = (firstArgument.getImaginaryPart() - secondArgument.getImaginaryPart()) * -1 + "i";
        else
            thirdToken = firstArgument.getImaginaryPart() - secondArgument.getImaginaryPart() + "i";
        if (firstArgument.getImaginaryPart() - secondArgument.getImaginaryPart() == 1 || firstArgument.getImaginaryPart() - secondArgument.getImaginaryPart() == -1)
            thirdToken = "i";
        if (firstArgument.getImaginaryPart() - secondArgument.getImaginaryPart() == 0) {
            thirdToken = " - real number";
            secondToken = "\b";
        }
        if (firstArgument.getRealPart() - secondArgument.getRealPart() == 0) {
            firstToken = "";
            secondToken = "\b";
//            thirdToken = firstArgument.getImaginaryPart() + secondArgument.getImaginaryPart() + "i";
        }
        return String.format("The expression: (%s) - (%s) returns: %s %s %s", firstArgument, secondArgument, firstToken, secondToken, thirdToken);
    }

    @Override
    public void setFirstArg(ComplexNumber complexNumber) {
        super.firstArgument = complexNumber;
    }

    @Override
    public void setSecondArg(ComplexNumber complexNumber) {
        super.secondArgument = complexNumber;
    }
}

package ru.aberezhnoy.compnumcalc.core.model.impl;

import ru.aberezhnoy.compnumcalc.core.model.ComplexNumber;

public class MulModel extends CalcModel {
    @Override
    public String getResult() {
        int calcForTheFirstToken = firstArgument.getRealPart() * secondArgument.getRealPart() - firstArgument.getImaginaryPart() * secondArgument.getImaginaryPart();
        String firstToken = String.valueOf(calcForTheFirstToken);
        int calcForTheThirdToken = firstArgument.getRealPart() * secondArgument.getImaginaryPart() + secondArgument.getRealPart() * firstArgument.getImaginaryPart();
        String secondToken = calcForTheThirdToken < 0 ? "-" : "+";
        String thirdToken;
        if (calcForTheThirdToken < 0)
            thirdToken = calcForTheThirdToken * -1 + "i";
        else
            thirdToken = calcForTheThirdToken + "i";
        if (calcForTheThirdToken == 1 || calcForTheThirdToken == -1)
            thirdToken = "i";
        if (calcForTheThirdToken == 0) {
            thirdToken = "- real number";
            secondToken = "\b";
        }
        if (calcForTheFirstToken == 0) {
            firstToken = "";
            secondToken = "\b";
            thirdToken = calcForTheThirdToken + "i";
        }
        return String.format("The expression: (%s) x (%s) returns: %s %s %s", firstArgument, secondArgument, firstToken, secondToken, thirdToken);
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

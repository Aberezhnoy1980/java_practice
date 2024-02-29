package ru.aberezhnoy.compnumcalc.core.model.impl;

import ru.aberezhnoy.compnumcalc.core.model.ComplexNumber;
import ru.aberezhnoy.compnumcalc.core.model.Model;

public abstract class CalcModel implements Model {
    ComplexNumber firstArgument;
    ComplexNumber secondArgument;
}


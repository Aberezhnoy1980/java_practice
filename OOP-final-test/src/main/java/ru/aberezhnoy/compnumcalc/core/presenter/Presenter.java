package ru.aberezhnoy.compnumcalc.core.presenter;

import ru.aberezhnoy.compnumcalc.core.model.ComplexNumber;
import ru.aberezhnoy.compnumcalc.core.model.Model;
import ru.aberezhnoy.compnumcalc.core.view.View;

public class Presenter {
    private final View view;
    private final Model model;

    public Presenter(Model model, View view) {
        this.view = view;
        this.model = model;
    }

    public void buttonClick() {
        ComplexNumber a = view.getValue("Input complex number represented in algebraic form, of the form: \\\"a + bi\\\", as a first argument: ");
        ComplexNumber b = view.getValue("Input complex number represented in algebraic form, of the form: \\\"a + bi\\\", as a second argument: ");
        model.setFirstArg(a);
        model.setSecondArg(b);
        String result = model.getResult();
        view.print(result);
    }
}

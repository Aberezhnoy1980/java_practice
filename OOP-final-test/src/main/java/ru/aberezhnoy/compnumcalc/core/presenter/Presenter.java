package ru.aberezhnoy.compnumcalc.core.presenter;

import ru.aberezhnoy.compnumcalc.core.model.ComplexNumber;
import ru.aberezhnoy.compnumcalc.core.model.Model;
import ru.aberezhnoy.compnumcalc.core.model.impl.DivModel;
import ru.aberezhnoy.compnumcalc.core.model.impl.MulModel;
import ru.aberezhnoy.compnumcalc.core.model.impl.SubModel;
import ru.aberezhnoy.compnumcalc.core.model.impl.SumModel;
import ru.aberezhnoy.compnumcalc.core.view.View;

public class Presenter {
    private final View view;
    private final Model[] models;

    public Presenter(View view) {
        this.view = view;
        this.models = new Model[]{new SumModel(), new SubModel(), new MulModel(), new DivModel()};
    }

    public void clickButton(Model model) {
        ComplexNumber a = view.getValue("Input complex number represented in algebraic form, of the form: \\\"a + bi\\\", as a first argument: ");
        ComplexNumber b = view.getValue("Input complex number represented in algebraic form, of the form: \\\"a + bi\\\", as a second argument: ");
        model.setFirstArg(a);
        model.setSecondArg(b);
        String result = model.getResult();
        view.print(result);
    }

    public Model[] getModels() {
        return models;
    }
}


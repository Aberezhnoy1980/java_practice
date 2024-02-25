package ru.aberezhnoy.calculator;

public class PresenterOfT <T extends CalcModel> {
    View view;
    Model model;

    public PresenterOfT(T model, View view) {
        this.model = model;
        this.view = view;
    }

    public void buttonClick() {
        int a = view.getValue("a");
        int b = view.getValue("b");
    }
}

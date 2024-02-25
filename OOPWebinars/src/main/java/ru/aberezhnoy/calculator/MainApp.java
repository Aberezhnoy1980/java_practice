package ru.aberezhnoy.calculator;

public class MainApp {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new SumModel(), new View());
        presenter.buttonClick();
        presenter.buttonClick();
        presenter.buttonClick();
        presenter.buttonClick();
    }
}

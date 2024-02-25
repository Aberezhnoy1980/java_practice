package ru.aberezhnoy.math.core.presenters;

import ru.aberezhnoy.math.core.infrastructure.Generator;
import ru.aberezhnoy.math.core.models.Model;
import ru.aberezhnoy.math.core.views.View;
import ru.aberezhnoy.math.mathematics.exceptions.UnacceptableValueException;
import ru.aberezhnoy.math.mathematics.shapes.Circle;
import ru.aberezhnoy.math.mathematics.shapes.Rectangle;
import ru.aberezhnoy.math.mathematics.shapes.Shape;

public class Presenter {
    Model model;
    View view;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void append() throws UnacceptableValueException {
        view.set("1 - Circle, 2 - Rectangle");
        String response = view.get();
        Shape figure;

        switch (response) {
            case "1":
                figure = Circle.create(Generator.number(), "Circle_" + Generator.number());
                break;
            default:
                figure = Rectangle.create(
                        Generator.number(),
                        Generator.number(),
                        "Rectangle_" + Generator.number());
                break;
        }

        model.append(figure);
        view.set("ok");
    }

    public void show() {
        view.set(model.show());
    }

    public void showArea() {
        view.set(String.format("All area %s", model.area()));
    }
}

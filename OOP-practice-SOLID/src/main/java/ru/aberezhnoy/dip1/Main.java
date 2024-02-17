package ru.aberezhnoy.dip1;

import ru.aberezhnoy.dip1.model.Report;
import ru.aberezhnoy.dip1.model.util.DisplayPrinter;
import ru.aberezhnoy.dip1.model.util.ReportPrinter;
import ru.aberezhnoy.logger.Log;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());

    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report(new ArrayList<>());
        report.calculate();
        report.output(new ReportPrinter());
        report.output(new DisplayPrinter());
    }
}

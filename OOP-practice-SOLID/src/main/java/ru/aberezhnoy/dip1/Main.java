package ru.aberezhnoy.dip1;

import ru.aberezhnoy.dip1.model.Report;
import ru.aberezhnoy.dip1.model.ReportItem;
import ru.aberezhnoy.dip1.model.util.ReportPrinter;
import ru.aberezhnoy.logger.Log;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());

    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        ArrayList<ReportItem> reportItems = new ArrayList<>();
        Report report = new Report(reportItems);
        report.calculate();
        report.output(new ReportPrinter());
        System.out.println();
    }
}

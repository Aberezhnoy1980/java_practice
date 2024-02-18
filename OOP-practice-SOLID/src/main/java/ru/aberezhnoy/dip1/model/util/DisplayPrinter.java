package ru.aberezhnoy.dip1.model.util;

import ru.aberezhnoy.dip1.model.ReportItem;
import ru.aberezhnoy.dip1.model.ReportManager;

import java.util.List;

public class DisplayPrinter implements ReportManager {
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to display");
        for (ReportItem item : items) {
            System.out.format("display %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}

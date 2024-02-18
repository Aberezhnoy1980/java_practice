package ru.aberezhnoy.lsp2.factory;

import ru.aberezhnoy.lsp2.model.Order;
import ru.aberezhnoy.lsp2.model.OrderBonus;

public class OrderFactory {
    public Order create(int quantity, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(quantity, price);
        }
        return new Order(quantity, price);
    }
}

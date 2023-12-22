package ru.aberezhnoy.vending_machine;

import ru.aberezhnoy.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private final List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getByName(String name) {
        for (Product p : products) {
            if (name.equals(p.getName())) {
                return p;
            }
        }
        return null;
    }

    public Product getProductId(int productId) {
        for (Product p : products) {
            if (p.getId() == productId) {
                return p;
            }
        }
        return null;
    }

    private String getProductListInfo() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Product list\n");
        for (Product p : products) {
            stringBuilder.append(p);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return getProductListInfo();
    }
}

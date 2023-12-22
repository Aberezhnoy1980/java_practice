package ru.aberezhnoy;

import ru.aberezhnoy.product.Bottle;
import ru.aberezhnoy.product.Product;
import ru.aberezhnoy.vending_machine.VendingMachine;

public class MainApp {
    public static void main(String... args) {
        int id = 0;
        final Product product1 = new Product(id++, "Twix", 100.0);
        final Product product2 = new Bottle(id++, "Coke", 120, 2);
        final Product product3 = new Product(id++, "Cheeps", 200);

        final VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        System.out.println(vendingMachine.getByName("Twix"));

        System.out.println(vendingMachine);
    }
}

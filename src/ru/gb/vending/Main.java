package ru.gb.vending;

import ru.gb.vending.product.Product;
import ru.gb.vending.product.bottle;
import ru.gb.vending.vending.Vending_Machine;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("twix", 80);
        Product product2 = new bottle("coca-cola", 90,);
        Product product3 = new Product("lays", 100);

        Vending_Machine.addProduct(product1);
        Vending_Machine.addProduct(product2);
        Vending_Machine.addProduct(product3);

        System.out.println(Vending_Machine);

    }
}

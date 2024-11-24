package ru.gb.vending.vending;

import ru.gb.vending.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Vending_Machine {
    private List<Product> productList;

    public Vending_Machine() {
        productList = new ArrayList<>();
    }
    public void addProduct(Product product){
        productList.add(product);
    }

    public Product findByName(String nameProduct){
        for(Product product: productList){
            if (product.getName().equalsIgnoreCase(nameProduct)){
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder.append("Список товаров:\n");
        for (Product product : productList) {
            StringBuilder.append(product);
            StringBuilder.append("\n");
        }
        return StringBuilder.toString();
    }
}
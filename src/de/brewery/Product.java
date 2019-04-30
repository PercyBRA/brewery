package de.brewery;

public class Product {

    private String name;
    private double amount;

    public Product(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}

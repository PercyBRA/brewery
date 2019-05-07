package de.brewery;

/**
 * The brewing process result.
 *
 */
public class Product {

    private String name;
    private double amount;

    /**
     * Creates an instance of a product
     * @param name
     * @param amount
     */
    public Product(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    /**
     * Simple toString.
     *
     * @return String representation of this class.
     */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}

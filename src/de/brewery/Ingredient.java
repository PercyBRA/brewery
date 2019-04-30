package de.brewery;

/**
 * Describes an ingredient.
 */
public class Ingredient {

    private String type;
    private double amount;

    /**
     * Creates an ingredient object
     *
     * @param type Type of the ingredient.
     * @param amount Amount of the ingredient.
     */
    public Ingredient(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    /**
     * If processed we need to remove the amount.
     */
    public void consumeAmount(double value) {
        this.amount = this.amount - value;
    }

    /**
     * Simple toString.
     *
     * @return String representation of this class.
     */
    @Override
    public String toString() {
        return "Ingredient{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}

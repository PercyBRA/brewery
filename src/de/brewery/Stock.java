package de.brewery;

import java.util.HashMap;
import java.util.Map;

/**
 * Class representing the stock of the brewery.
 *
 */
public class Stock {

    private Map<String, Ingredient> stocks;

    /**
     * Creates an isntance of the stock.
     */
    public Stock() {
        this.stocks = new HashMap<>();
    }

    /**
     * Adds an ingredient to the stock.
     *
     * @param in Ingredient to be added
     */
    public void addIngredient(Ingredient in) {
        this.stocks.put(in.getType(), in);
    }

    /**
     * Remove an ingredient.
     *
     * @param in Ingredient to be removed from stock.
     * @throws NoSuchFieldException
     */
    public void removeIngredient(Ingredient in) throws NoSuchFieldException {
        if (stocks.containsKey(in.getType())) {
            Ingredient stockIngredient = stocks.get(in.getType());
            stockIngredient.consumeAmount(in.getAmount());
        }
        else
            throw new NoSuchFieldException();

    }

    /**
     * Simple toString.
     *
     * @return String representation of this class.
     */
    @Override
    public String toString() {
        return "Stock{" +
                "stocks=" + stocks +
                '}';
    }
}

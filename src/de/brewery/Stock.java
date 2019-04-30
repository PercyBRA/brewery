package de.brewery;

import java.util.HashMap;
import java.util.Map;

public class Stock {

    private Map<String, Ingredient> stocks;

    public Stock() {
        this.stocks = new HashMap<>();
    }

    public void addIngredient(Ingredient in) {
        this.stocks.put(in.getType(), in);
    }

    public void removeIngredient(Ingredient in) throws NoSuchFieldException {
        if (stocks.containsKey(in.getType())) {
            Ingredient stockIngredient = stocks.get(in.getType());
            stockIngredient.consumeAmount(in.getAmount());
        }
        else
            throw new NoSuchFieldException();

    }

    @Override
    public String toString() {
        return "Stock{" +
                "stocks=" + stocks +
                '}';
    }
}

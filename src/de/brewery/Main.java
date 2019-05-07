package de.brewery;

import de.brewery.util.Log;

public class Main {

    /**
     * Main entry point to start out micro brewery solution
     *
     * @param args No args yet.
     */
    public static void main(String[] args) {

        // instantiate a recipe
        Recipe r = new Recipe("Helles", 14, 150);

        // add some ingredients
        r.addIngredient(new Ingredient("wheat", 5));
        r.addIngredient(new Ingredient("malt", 2));
        r.addIngredient(new Ingredient("water", 8));
        r.addIngredient(new Ingredient("hop", 5));


        // fill the stock
        Stock stock = new Stock();
        stock.addIngredient(new Ingredient("wheat", 50));
        stock.addIngredient(new Ingredient("malt", 20));
        stock.addIngredient(new Ingredient("water", 200));
        stock.addIngredient(new Ingredient("hop", 100));
        Log.info(stock.toString());


        // start the brewing process
        Log.info("Brew time " + Process.brew(r, stock));
        Log.info(stock.toString());
    }
}

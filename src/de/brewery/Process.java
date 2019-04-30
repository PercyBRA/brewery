package de.brewery;

import de.brewery.util.Log;

import java.util.Iterator;

public class Process {

    public static Product brew(Recipe recipe, Stock stock) {
        Log.debug("Brewing process started!");
        Iterator<Ingredient> it = recipe.getIngredients();
        double amount = 0;
        while(it.hasNext()) {
            Ingredient in = it.next();
            try {
                stock.removeIngredient(in);
                amount += in.getAmount();
            } catch (NoSuchFieldException e) {
                Log.error(e.getMessage());
            }
        }

        return new Product(recipe.getName(), amount);
    }
}

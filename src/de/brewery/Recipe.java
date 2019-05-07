package de.brewery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A recipe for a beer.
 */
public class Recipe {

    private String name;
    private List<Ingredient> ingredients;
    private int time;


    /**
     * Creates a new recipe object.
     *
     * @param name this is the unique name of the recipe
     * @param time duration of brewing process in hours
     */
    public Recipe(String name, int time, double litre) {
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    /**
     * Add an ingredient to te recipe
     *
     * @param in ingredient
     */
    public void addIngredient(Ingredient in) {
        this.ingredients.add(in);
    }


    /**
     * Returns the list of ingredients.
     *
     * @return Ingredients
     */
    public Iterator<Ingredient> getIngredients() {
        return ingredients.iterator();
    }

    /**
     * Simple toString jus to get some insights of the object
     *
     * @return String representation of this class.
     */
    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", time=" + time +
                '}';
    }
}

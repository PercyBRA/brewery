package de.brewery;

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

        // start the brewing process
        System.out.println(r);
        System.out.println("Brew time " + r.brew());
        System.out.println(r);
    }
}

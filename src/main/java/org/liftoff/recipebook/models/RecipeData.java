package org.liftoff.recipebook.models;

import java.util.ArrayList;

public class RecipeData {
    public static ArrayList<Recipe> findRecipe(String value, Iterable<Recipe> allRecipes) {

        ArrayList<Recipe> recipeResults = new ArrayList<>();

        String lower_val = value.toLowerCase();

        for (Recipe recipe : allRecipes) {

            if (recipe.getName().toLowerCase().contains(lower_val) ||
                recipe.getDescription().toLowerCase().contains(lower_val) ||
                recipe.getIngredients().toLowerCase().contains(lower_val)) {
                recipeResults.add(recipe);

            }
        }
        return recipeResults;
    }
}

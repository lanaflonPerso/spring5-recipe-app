package guru.springframework.recipe.service;

import guru.springframework.recipe.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}

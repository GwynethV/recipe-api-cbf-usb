package com.example.recipeapi.service;

import com.example.recipeapi.entity.Recipe;
import com.example.recipeapi.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class RecipeService {
    @Autowired
            private RecipeRepository repository;
    public Recipe saveRecipe( Recipe recipe){
        return repository.save(recipe);

    }
    public List<Recipe> saveRecipes(List<Recipe> products) {
        return repository.saveAll(products);
    }

    public List<Recipe> findAllRecipes() {
        return repository.findAll();
    }

    public Recipe getRecipeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Recipe getRecipeByName(String name) {
        return repository.findByName(name);
    }

    public String deleteRecipe(int id) {
        repository.deleteById(id);
        return "Recipe removed !! " + id;
    }

    public Recipe updateRecipe(Recipe recipe) {
        Recipe existingRecipe= repository.findById(recipe.getId()).orElse(null);
        existingRecipe.setName(recipe.getName());
        existingRecipe.setIngredients(recipe.getIngredients());
        existingRecipe.setInstructions(recipe.getInstructions());
        return repository.save(existingRecipe);
    }


}
package com.example.recipeapi.controller;


import com.example.recipeapi.entity.Recipe;
import com.example.recipeapi.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;

import java.util.List;

//
@RestController

public class RecipeController {
    @Autowired
    private RecipeService service;

    @PostMapping("/addrecipe")
    private Recipe addRecipe(@RequestBody Recipe recipe){
        return service.saveRecipe(recipe);

    }
    @PostMapping("/addrecipes")
    private List<Recipe> addRecipes(@RequestBody List<Recipe> recipe){
        return service.saveRecipes(recipe);

    }
    @GetMapping("/allrecipes")
    private List<Recipe> findAllRecipes(){
        return service.findAllRecipes();
    }

    @GetMapping("/recipes/{id}")
    private Recipe findRecipeById(@PathVariable int Id){
        return service.getRecipeById(Id);

    }
    @GetMapping("/recipe/{name}")
    private Recipe findByName(@PathVariable String name){
        return service.getRecipeByName(name);

    }
    @PutMapping("/update")
    private Recipe updateRecipe(@RequestBody Recipe recipe) {
        return service.updateRecipe(recipe);
    }

    @DeleteMapping("/delete{id}")
    private String deleteRecipe(int Id) {
        return service.deleteRecipe(Id);
    }

}

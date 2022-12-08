package com.example.recipeapi.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "Recipe")


public class Recipe {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String ingredients;
    private String instructions;
}





package com.vq.vqooks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        ArrayList<Recipes> recipes = new ArrayList<>();
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("poosy");
        ingredients.add("poosy");
        ingredients.add("poosy");
        ingredients.add("poosy");
        recipes.add(new Recipes("kitty", ingredients,"cook it really well"));
        ingredients = new ArrayList<>();
        ingredients.add("kitty");
        ingredients.add("kitty");
        ingredients.add("kitty");

        recipes.add(new Recipes("poosy", ingredients, "cook"));
        GridView  recipesGridView = (GridView) findViewById(R.id.list);
        RecipesAdapter adapter = new RecipesAdapter(this, recipes);
        recipesGridView.setAdapter(adapter);

    }
}

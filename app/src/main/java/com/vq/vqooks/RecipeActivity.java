package com.vq.vqooks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_recipe);

        ArrayList<Recipes> recipes = new ArrayList<>();
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("eggs");
        ingredients.add("sat");
        ingredients.add("pepper");
        ingredients.add("vegie");
        recipes.add(new Recipes("Omelette", ingredients, "cook it really well", R.drawable.main_activity_wallpaper));
        ingredients = new ArrayList<>();
        ingredients.add("sausage");
        ingredients.add("pasta");
        ingredients.add("sauce");
        recipes.add(new Recipes("Sausage Pasta", ingredients, "cook it really well", R.drawable.main_activity_wallpaper));
        ingredients = new ArrayList<>();
        ingredients.add("Rice");
        ingredients.add("spice sausage");
        ingredients.add("vegie");
        recipes.add(new Recipes("Fried Rice", ingredients, "cook", R.drawable.main_activity_wallpaper));


        GridView recipesGridView = (GridView) findViewById(R.id.list);
        final RecipesAdapter adapter = new RecipesAdapter(this, recipes);
        recipesGridView.setAdapter(adapter);

        recipesGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Recipes currentRecipe = adapter.getItem(i);


                Intent myInt = new Intent(RecipeActivity.this, DetailedRecipe.class);
                myInt.putExtra("currentRecipe",currentRecipe);
                startActivity(myInt);
            }
        });

    }
}

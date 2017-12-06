package com.vq.vqooks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedRecipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_recipe);
        Intent i = getIntent();
        Recipes getRecipes =(Recipes) i.getSerializableExtra(("currentRecipe"));

        TextView name = (TextView) findViewById(R.id.name_detailed);
        name.setText(getRecipes.getName());

        ImageView image = (ImageView) findViewById(R.id.image_detailed);
        image.setImageResource(getRecipes.getImageResourceId());

        TextView instruction = (TextView) findViewById(R.id.instruction_detailed);
        instruction.setText(getRecipes.getInstruction());

        TextView ingredients = (TextView) findViewById(R.id.ingredients_detailed);
        ingredients.setText(getRecipes.getIngredients());

    }

}

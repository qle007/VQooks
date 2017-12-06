package com.vq.vqooks;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.net.URL;
import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {
    public static final String JSON_URL = "https://script.googleusercontent.com/macros/echo?user_content_key=0bvTgW45juVa36Z93aeI8lGY2BHdaQiOyZzDbpCtCga5NfiAeXt35MnlGGAGgyygu62nbyePX0aJuRExrRH4X-wGBb4uLGmZOJmA1Yb3SEsKFZqtv3DaNYcMrmhZHmUMWojr9NvTBuBLhyHCd5hHa1GhPSVukpSQTydEwAEXFXgt_wltjJcH3XHUaaPC1fv5o9XyvOto09QuWI89K6KjOu0SP2F-BdwUZ4b7a-V8nwzBYbGN1e34Agsp_zP0LsoF3VlgMkKHcfUYd3DJYKwwnzUS-UfIte535y7FLqOV0Tk27B8Rh4QJTQ&lib=MnrE7b2I2PjfH799VodkCPiQjIVyBAxva";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_recipe);
        RecipeAsyncTask task = new RecipeAsyncTask();
        task.execute();


    }

    private void updateUi(ArrayList<Recipes> recipes) {
        GridView recipesGridView = (GridView) findViewById(R.id.list);
        final RecipesAdapter adapter = new RecipesAdapter(this, recipes);
        recipesGridView.setAdapter(adapter);

        recipesGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Recipes currentRecipe = adapter.getItem(i);


                Intent myInt = new Intent(RecipeActivity.this, DetailedRecipe.class);
                myInt.putExtra("currentRecipe", currentRecipe);
                startActivity(myInt);
            }
        });
    }

    private class RecipeAsyncTask extends AsyncTask<URL, Void, ArrayList<Recipes>> {

        @Override
        protected ArrayList<Recipes> doInBackground(URL... URLs) {
            ArrayList<Recipes> recipe = Utils.fetchEarthquakeData(JSON_URL);
            return recipe;
        }
        protected void onPostExecute(ArrayList<Recipes> recipes)
        {
            updateUi(recipes);
        }
    }
}

package com.vq.vqooks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ingredient button
        Button ingButton = (Button) findViewById(R.id.ingredients);
        ingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ingIntent = new Intent(MainActivity.this, IngredientsActivity.class);
                startActivity(ingIntent);
            }
        });

        //recipe button
        Button recButton = (Button) findViewById(R.id.recipes);
        recButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recIntent = new Intent(MainActivity.this, RecipeActivity.class);
                startActivity(recIntent);
            }
        });


    }
}

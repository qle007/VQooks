package com.vq.vqooks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Quoc on 12/4/2017.
 */

public class RecipesAdapter extends ArrayAdapter<Recipes> {

    public RecipesAdapter(@NonNull Context context, List<Recipes> recipes)
    {
        super(context, 0, recipes);
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.recipes_list_item, parent, false);
        }
        Recipes currentRecipes = getItem(position);

        TextView recipeTextView = (TextView) listItemView.findViewById(R.id.recipe);
        recipeTextView.setText(currentRecipes.getName());
        return listItemView;
    }
}

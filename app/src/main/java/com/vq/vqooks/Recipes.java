package com.vq.vqooks;

import java.io.Serializable;

/**
 * Created by Quoc on 12/4/2017.
 */
@SuppressWarnings("serial")
public class Recipes implements Serializable {


    private String name;
    private String ingredients;
    private String instruction;
    private int imageResourceId;

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }


    public Recipes(String name, String ingredients, String instruction, int imageResourceId) {
        this.name = name;
        this.ingredients = ingredients;
        this.instruction = instruction;
        this.imageResourceId = imageResourceId;
    }
}

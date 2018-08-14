package Pizzeria;

import java.util.Arrays;
import java.util.List;

public enum Pizza {
    MARGHERITA ("Sosik ser"), CAPRICIOSA ("Sosik jalapemno krowa koty psy"), PROSCIUTTO ("Sosik cośtanm tsatsyki");

    private String[] ingredients;

    Pizza (String s) {
        this.ingredients = s.split(" ");
    }

    public String getIngredients() {
        return ingredients.toString();
    }

    @Override
    public String toString() {
        return "Skład pizzy: " + Arrays.toString(ingredients);
    }
}

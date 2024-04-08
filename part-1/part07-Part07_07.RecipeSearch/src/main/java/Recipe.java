
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ace
 */
public class Recipe {

    private String name;
    private int time;
    private List<String> ingredients = new ArrayList<>();

    public Recipe(String name, int time, List<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }

    public List<String> getIngridients() {
        return this.ingredients;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.time + ", ingredients " + this.ingredients;
    }
    

}

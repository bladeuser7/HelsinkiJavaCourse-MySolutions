
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ace
 */
public class Abbreviations {

    private HashMap<String, String> abbreviation;

    public Abbreviations() {
        this.abbreviation = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviation.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviation.containsKey(abbreviation)) {
            return true;
        } else return false;

    }

    public String findExplanationFor(String abbreviation) {
        if (this.abbreviation.containsKey(abbreviation)) {
            return this.abbreviation.get(abbreviation);
        }  else return null;
    }
}

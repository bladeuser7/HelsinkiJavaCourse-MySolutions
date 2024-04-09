/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ace
 */
public class Bird {

    private String name;
    private String latinName;
    private int observed;

    public Bird(String name, String latinName, int observed) {
        this.name = name;
        this.latinName = latinName;
        this.observed = observed;
    }

    public String getName() {
        return this.name;
    }

    public void observedPlusOne() {
        this.observed = observed + 1;
    }
    
    public int getObserved() {
        return this.observed;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public String toString() {
        return getName() + " (" + getLatinName() + "): " + getObserved() + " observations";
    }
}

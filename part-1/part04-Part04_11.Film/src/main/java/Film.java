/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ace
 */
public class Film {

    private String filmname;
    private int ageRating;

    public Film(String filmname, int filmageRating) {
        this.filmname = filmname;
        this.ageRating = filmageRating;
    }

    public String name() {
//        System.out.println(this.name);
        return this.filmname;
    }

    public int ageRating() {
        return this.ageRating;
    }

}

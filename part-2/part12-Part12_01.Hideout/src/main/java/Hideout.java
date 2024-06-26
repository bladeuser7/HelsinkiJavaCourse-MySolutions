/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ace
 */
public class Hideout<Thing> {

    Thing x;
    private boolean hidden;

    public Hideout() {

    }

    public void putIntoHideout(Thing toHide) {
        this.hidden = true;
        this.x = toHide;
    }

    public Thing takeFromHideout() {
        this.hidden = false;
        return x;
    }

    public boolean isInHideout() {
        return hidden;
    }
}

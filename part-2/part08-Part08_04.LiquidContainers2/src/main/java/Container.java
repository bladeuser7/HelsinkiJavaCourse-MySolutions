/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ace
 */
public class Container {
    private int initialAmount;

    public Container() {
        this.initialAmount = 0;
    }

    public int contains() {
        return this.initialAmount;
    }

    public void add(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        if (amount + this.initialAmount > 100) {
            initialAmount = 100;
        } else if (amount >= 0 && amount <= 100) {
            this.initialAmount += amount;
        }
    }

    public void remove(int amount) {
        if (amount >= 0 && amount <= 100) {
            this.initialAmount -= amount;
        } else if (initialAmount > 100) {
            initialAmount = 0;
        }
        if (initialAmount < 0) {
            this.initialAmount = 0;
        }
    }

    public String toString() {
        return this.initialAmount + "/100";
    }
}

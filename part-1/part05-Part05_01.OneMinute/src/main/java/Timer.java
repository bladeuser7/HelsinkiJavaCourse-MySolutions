/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ace
 */
public class Timer {

    private ClockHand seconds;
    private ClockHand hOfSec;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hOfSec = new ClockHand(100);
    }

    public void advance() {
        this.hOfSec.advance();

        if (this.hOfSec.value() == 0) {
            this.seconds.advance();
        }
    }
    public String toString() {
        return this.seconds + ":" + this.hOfSec;
    }
}

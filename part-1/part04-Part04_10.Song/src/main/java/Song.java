/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ace
 */
public class Song {
    private int length;
    private String name;
    
    public Song(String name, int length){
        this.length = length;
        this.name = name;
    }

    public String name(){
        return this.name;
    }
    public int length(){
        return this.length;
    }
}
    

    


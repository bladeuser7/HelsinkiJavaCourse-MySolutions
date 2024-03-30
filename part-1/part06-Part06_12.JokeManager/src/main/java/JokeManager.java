
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ace
 */
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        System.out.println("Write the joke to be added:");
        this.jokes.add(joke);
    }

    public String drawJoke() {
        System.out.println("Drawing a joke.");
        if (jokes.isEmpty()){
            return ("Jokes are in short supply.");
        } else {
             Random draw = new Random();
        int index = draw.nextInt(jokes.size());
            System.out.println(this.jokes.get(index));
            return (this.jokes.get(index));
            
        }
    }

    public void printJokes() {
        System.out.println("Printing the jokes.");
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}


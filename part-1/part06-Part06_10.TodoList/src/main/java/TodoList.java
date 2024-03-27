
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ace
 */
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task){
    this.list.add(task);
    }
    public void print() {
        int counter = 0;
        for (String listing : list) {
            counter++;
            System.out.println(counter + ": " + listing);
        }
    }
    public void remove(int number) {
        if (number < list.size() + 1)
        this.list.remove(number - 1);
    }
}

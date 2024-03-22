
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
public class Room {

    private ArrayList<Person> person;

    public Room() {
        this.person = new ArrayList();
    }

    public void add(Person person) {
        this.person.add(person);
    }

    public boolean isEmpty() {
        if (person.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.person;
    }

    public Person shortest() {
        if (person.isEmpty()) {
            return null;
        }
        Person toReturn = this.person.get(0);
        for (Person persons : person) {
            if (toReturn.getHeight() > persons.getHeight()) {
                toReturn = persons;
            }
        }
        return toReturn;
    }

    public Person take() {
        Person a = this.shortest();
        this.person.remove(this.shortest());
        return a;
    }
}

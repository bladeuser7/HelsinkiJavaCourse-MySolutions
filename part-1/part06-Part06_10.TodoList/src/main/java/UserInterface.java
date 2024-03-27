
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ace
 */
public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;

    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            proccessCommand(command);
        }
    }

    public void proccessCommand(String command) {
        if (command.equals("add")) {
            add();
        }
        if (command.equals("list")) {
            list();
        }
        if (command.equals("remove")) {
            remove();
        }
    }

    public void add() {
        System.out.println("Task: ");
        String task = scanner.nextLine();
        this.list.add(task);
    }

    public void list() {
        this.list.print();
    }

    public void remove() {
        System.out.println("Which task was completed?");
        int toRemove = scanner.nextInt();
        this.list.remove(toRemove);
    }

}

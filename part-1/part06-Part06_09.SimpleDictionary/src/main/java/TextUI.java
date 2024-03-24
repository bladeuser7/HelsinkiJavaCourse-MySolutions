
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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("end")) {
                System.out.println("Bye Bye!");
                break;
            }
            if (command.equalsIgnoreCase("add")) {
                System.out.println("Word:");
                String toTranslate = scanner.nextLine();
                System.out.println("Translation:");
                String translated = scanner.nextLine();
                simpleDictionary.add(toTranslate, translated);
            }
            if (command.equalsIgnoreCase("search")) {
                System.out.println("To be translated:");
                String searching = scanner.nextLine();
                System.out.println("Translation: ");
                if (simpleDictionary.exists(searching)) {
                    System.out.println(this.simpleDictionary.translate(searching));
                } else {
                    System.out.println("Word " + searching + " was not found.");
                }
            } 
//            else {
////                System.out.println("Uknown command");
//            }
        }
    }
}

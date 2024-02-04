
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
        System.out.println("Name: ");
        String name = scanner.nextLine();
        Item one = new Item(name);
        items.add(one);
            
        if (name.isEmpty()) {
            break;
        }System.out.println(items);
        System.out.println("");
        }
        

    }
}

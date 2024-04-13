
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();
        Container container2 = new Container();
        int amount;
        while (true) {
            System.out.println("First: " + container
                    + "\n" + "Second: " + container2);
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container.add(amount);
            }
            if (command.equals("move")) {
                if (container.contains() >= amount) {
                    container.remove(amount);
                    container2.add(amount);
                } else if (amount > container.contains()) {
                    container2.add(container.contains());
                    container.remove(container.contains());
                }
            }
            if (command.equals("remove")) {
                container2.remove(amount);
            }

        }
    }

}

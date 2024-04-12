
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int add = 0;
        int move = 0;
        int remove = 0;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

//            add = value;
            if (command.equals("add")) {
                add = Integer.valueOf(parts[1]);
                if (add >= 100) {
                    add = 100;
                }
                if (add <= 0) {
                    add = 0;
                }
            }
//            move = value;
            if (command.equals("move")) {
                move = Integer.valueOf(parts[1]);
                if (move >= 100) {
                    move = 100;
                }
                if (move <= 0) {
                    move = 0;
                }
            }
//            remove = value;
            if (command.equals("remove")) {
                remove = Integer.valueOf(parts[1]);
                if (remove >= 100) {
                    remove = 100;
                }
                if (remove <= 0) {
                    remove = 0;
                }
            }

            if (input.equals("quit")) {
                break;
            }
            if (command.equals("add")) {
                if (first + add <= 100) {
                    first = first + add;
                } else if (add + first >= 100) {
                    first = 100;
                }
            }
            if (command.equals("move")) {
                if (first >= move) {
                    first = first - move;
                    second = second + move;
                } else if (first <= move) {
                    second = second + first;
                    first = 0;
                } if (second > 100) {
                    second = 100;
                }
            }
            if (command.equals("remove")) {
                if (second - remove >= 0 && second >= 0) {
                    second = second - remove;
                } else if (second - remove <= 0) {
                    second = 0;
                }
            }

        }
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.println("?");
            String command = scan.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                break;
            }
            if (command.equalsIgnoreCase("add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                birds.add(new Bird(name, latinName, 0));

            }
            if (command.equalsIgnoreCase("Observation")) {
                System.out.println("Bird?");
                String observed = scan.nextLine();
                for (Bird birdie : birds) {
                    if (observed.equals(birdie.getName())) {
                        System.out.println("observed");
                        birdie.observedPlusOne();
                    }
                }
            }
            if (command.equalsIgnoreCase("all")) {
                for (Bird bird : birds) {
                    System.out.println(bird.toString());
                }
            }
            if (command.equalsIgnoreCase("one")) {
                System.out.println("Bird?");
                String birdName = scan.nextLine();
                for (Bird bird : birds) {
                    if (birdName.equalsIgnoreCase(bird.getName())) {
                        System.out.println(bird.toString());
                    }
                }
            }
        }
    }
}

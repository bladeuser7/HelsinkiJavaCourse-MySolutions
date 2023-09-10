
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
System.out.println("Give a string:");
String text = scanner.nextLine();
        System.out.println("Give an integer:");
        Integer intValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        Double doubleValue = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        Boolean booleanValue = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + text);
            System.out.println("You gave the integer " + intValue);
                System.out.println("You gave the double " + doubleValue);
                    System.out.println("You gave the boolean " + booleanValue);
    }
}

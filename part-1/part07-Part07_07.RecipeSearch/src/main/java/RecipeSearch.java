
import java.io.IOException;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface recipe = new UserInterface(scanner);
        recipe.start();

    }
}

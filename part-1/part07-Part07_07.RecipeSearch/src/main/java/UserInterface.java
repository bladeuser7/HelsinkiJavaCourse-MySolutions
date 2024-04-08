
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("File to read: ");
        String fileToRead = scanner.nextLine();

        System.out.println("Commands: "
                + "\n" + "list - lists the recipes "
                + "\n" + "stop - stops the program"
                + "\n" + "find name - searches recipes by name"
                + "\n" + "find cooking time - searches recipes by cooking time"
                + "\n" + "find ingredient");

        System.out.println("Enter command:");
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                printRecipesList(fileToRead);
            }
            if (command.equals("find name")) {
                findRecipeName(fileToRead);
            }
            if (command.equals("find cooking time")) {
                findCookingTime(fileToRead);
            }
            if (command.equals("find ingredient")) {
                findIngredient(fileToRead);
            }
        }

    }

    public List<Recipe> readRecipeFromFile(String fileToRead) {
        List<Recipe> recipes = new ArrayList<>();
        List<String> ingredients = new ArrayList<>();

        String name = null;
        int time = 0;

        try (Scanner fileReader = new Scanner(Paths.get(fileToRead))) {

            for (int i = 0; i <= Files.lines(Paths.get(fileToRead)).count(); i++) {
                String row = null;
                if (fileReader.hasNextLine()) {
                    row = fileReader.nextLine();

                    boolean matcherCapitalBoolean = Pattern.matches(".*[A-Z].*", row);
                    boolean matcherLowercaseBoolean = Pattern.matches("^[a-z ]+$", row);
                    boolean matcherDigitBoolean = Pattern.matches("\\d+", row);

                    if (row.isEmpty()) {
                        recipes.add(new Recipe(name, time, new ArrayList<>(ingredients)));
                        ingredients.clear();
                    }

                    if (matcherCapitalBoolean) {
                        name = row;
                    } else if (matcherLowercaseBoolean) {
                        ingredients.add(row);
                    } else if (matcherDigitBoolean) {
                        time = Integer.valueOf(row);
                    }
                } else {
                    recipes.add(new Recipe(name, time, new ArrayList<>(ingredients)));
                    ingredients.clear();
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recipes;
    }

    public String fileToRead() {
        String file = scanner.nextLine();
        return file;
    }

    private void printRecipesList(String fileToRead) {
//        read file
//      create datastructure
//      print datastructure
        List<Recipe> recipes = readRecipeFromFile(fileToRead);
        System.out.println("Recipes: ");
//        System.out.println(recipes);
//        System.out.println("1" + readRecipeFromFile(fileToRead));
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }

    }

    private void findRecipeName(String fileToRead) {
        System.out.println("Searched word: ");
        List<Recipe> recipes = readRecipeFromFile(fileToRead);
        String searchName = scanner.nextLine();
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(searchName)) {
                System.out.println(recipe);
            }
        }
    }

    private void findCookingTime(String fileToRead) {
        System.out.println("Max cooking time: ");
        int maxTime = Integer.valueOf(scanner.nextLine());
        List<Recipe> recipes = readRecipeFromFile(fileToRead);
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= maxTime) {
                System.out.println(recipe);
            }
        }

    }

    private void findIngredient(String fileToRead) {
        System.out.println("Ingredient: ");
        String searchedIngredient = scanner.nextLine();
        List<Recipe> recipes = readRecipeFromFile(fileToRead);
        recipes.stream().filter(r -> r.getIngridients().contains(searchedIngredient)).forEach(System.out::println);
//        
//        for (Recipe recipe : recipes) {
//            if (recipe.getIngridients().contains(searchedIngredient)) {
//                System.out.println(recipe);
//            }
//        }
    }

}

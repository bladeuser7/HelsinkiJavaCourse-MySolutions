
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int loses = 0;
        try (Scanner filescanner = new Scanner(Paths.get(file))) {
            while (filescanner.hasNextLine()) {
                String line = filescanner.nextLine();
                String[] parts = line.split(",");
                if (team.equals(parts[0]) && Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                    wins++;
                } if (team.equals(parts[0]) && Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])) {
                    loses++;
                }
                if (team.equals(parts[1]) && Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])) {
                    wins++;
                } if (team.equals(parts[1]) && Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                    loses++;
                }
                if (line.contains(team)) {
                    games++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loses);

    }
}